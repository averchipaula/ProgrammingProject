package Multimi;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Obiect {

    @Test
    public void Obiect(){
        //Array=toate elementele trebuie sa fie de acelasi tip array-[] ,new ,
        // capacitatea elementelor, length
        //List
        //Hashmap
        PrintNumeArray();
        PrintNumeLista();
        PrintValHashmap();
        TariOrase();
    }
    //Printam toate valorile dintr-un Array
    public void PrintNumeArray(){
        String[] Sir = new String[4];
        Sir[0]="Ana";
        Sir[1]="Alex";
        Sir[2]="Bogdan";
        Sir[3]="Rares";

        for(Integer index=0;index<Sir.length;index++){
            System.out.println(Sir[index]);
        }

    }

    //List=nu ai nevoie sa-i spui dimensiunea, size
    public void PrintNumeLista(){
        List<String> Lista= new ArrayList<>();
        Lista.add("Ana");
        Lista.add("Alex");
        Lista.add("Bogdan");
        Lista.add("Rares");
        for(Integer index=0;index<Lista.size(); index++){
            System.out.println(Lista.get(index));
        }

    }

    //Hashmap = key value (cu ajutorul unui key poti sa def. categoria) ,
    // nu poti accesa "key" fara o valoare
    //Printeaza valori diferite dintr-o multime
    public void PrintValHashmap(){
        HashMap<String,String> HHBB= new HashMap<>();
        HHBB.put("fruct", "mar");
        HHBB.put("haina", "pantaloni");
        HHBB.put("leguma", "cartof");
        for(String key: HHBB.keySet()){
            System.out.println("Cheia este "+ key );
            System.out.println("Valoarea este "+ HHBB.get(key));
        }


    }

    public void TariOrase(){
        List<String> OraseRomania = new ArrayList<>();
        OraseRomania.add("Dej");
        OraseRomania.add("Gherla");
        OraseRomania.add("Cluj");
        List<String> OraseItalia = new ArrayList<>();
        OraseItalia.add("Roma");
        OraseItalia.add("Torino");
        List<String> OraseSpania = new ArrayList<>();
        OraseSpania.add("Barcelona");
        OraseSpania.add("Madrid");
        OraseSpania.add("Valencia");
        OraseSpania.add("Malaga");

        HashMap<String, List<String>> HMAP = new HashMap<>();
        HMAP.put("Romania", OraseRomania);
        HMAP.put("Italia" , OraseItalia);
        HMAP.put("Spania", OraseSpania);

        for(String key: HMAP.keySet()){
            System.out.println("Tara este "+ key );
            System.out.println("Orasele sunt "+ HMAP.get(key));
        }

    }


}
