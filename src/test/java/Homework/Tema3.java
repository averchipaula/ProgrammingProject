package Homework;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Tema3 {

    @Test

    public void Multimi() {
        PrintNumeIng();
        PrintNumeList();
        ValHashmap();
        Printlistofing();



    }

    //Lista de ingrediente cu Array
    public void PrintNumeIng() {
        String[] Sir = new String[10];
        Sir[0] = "pui";
        Sir[1] = "cartofi";
        Sir[2] = "mar";
        Sir[3] = "oregano";
        Sir[4] = "cascaval";
        Sir[5] = "unt";
        Sir[6] = "paine";
        Sir[7] = "paste";
        Sir[8] = "sunca";
        Sir[9] = "peste";


        for (Integer index = 0; index < Sir.length; index++) {
            System.out.println(Sir[index]);
        }

    }

    // cu List
    public void PrintNumeList() {
        List<String> Lista = new ArrayList<>();
        Lista.add("pui");
        Lista.add("cartofi");
        Lista.add("mar");
        Lista.add("oregano");
        Lista.add("cascaval");
        Lista.add("unt");
        Lista.add("paine");
        Lista.add("paste");
        Lista.add("sunca");
        Lista.add("peste");
        for (Integer index = 0; index < Lista.size(); index++) {
            System.out.println(Lista.get(index));
        }

    }


    //Hashmap 2
    public void ValHashmap(){
        HashMap<String,String> Ingr= new HashMap<>();
        Ingr.put("Fruct", "mar");
        Ingr.put("Carne", "pui");
        Ingr.put("leguma", "cartof");
        Ingr.put("Lactate", "lapte");
        Ingr.put("Condimente","sare");
        Ingr.put("Fainoase", "paste");

        for(String key: Ingr.keySet()){
            System.out.println("Cheia este "+ key );
            System.out.println("Valoarea este "+ Ingr.get(key));
        }


    }

    //Hashmap 2
    public void Printlistofing(){
        List<String> IngredienteSupa = new ArrayList<>();
        IngredienteSupa.add("Pui");
        IngredienteSupa.add("Apa");
        IngredienteSupa.add("Morcovi");
        IngredienteSupa.add("Patrunjel");
        List<String> IngredientePaste = new ArrayList<>();
        IngredientePaste.add("Apa");
        IngredientePaste.add("Ciuperci");
        IngredientePaste.add("Smantana");
        IngredientePaste.add("Sare");
        List<String> IngredienteSalata = new ArrayList<>();
        IngredienteSalata.add("Castraveti");
        IngredienteSalata.add("Rosi");
        IngredienteSalata.add("Ardei");
        List<String> IngredienteSarmale = new ArrayList<>();
        IngredienteSarmale.add("Ceapa");
        IngredienteSarmale.add("Carne");
        IngredienteSarmale.add("Varza");




        HashMap<String, List<String >> Ingr= new HashMap<>();
        Ingr.put("Supa", IngredienteSupa);
        Ingr.put("Paste",IngredientePaste);
        Ingr.put("Salata", IngredienteSalata);
        Ingr.put("Sarmale", IngredienteSarmale);



        for( String key: Ingr.keySet() ) {
            System.out.println(" Mancarea este " + key);
            System.out.println(" Ingredientele sunt " + Ingr.get(key));

        }




    }




}
