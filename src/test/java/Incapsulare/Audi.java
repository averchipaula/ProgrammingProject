package Incapsulare;

import java.util.List;

public class Audi extends Masina {

    public List<String> dotariInterioare;

    public List<String> dotariExterioare;

    public Audi(String brand, String model, Integer pret) {
        super(brand, model, pret);
    }

    public void infoAudi() {
        System.out.println(getBrand());
        System.out.println(getModel());
        System.out.println(getPret());
    }

    //Suprascriem o metoda din clasa parinte
    //Daca nu punem @Override nu stie sa o stie sa o gaseasca
    @Override
    public void cumparaMasina() {
        System.out.println("Vreau sa cumpar Audi!");
        super.cumparaMasina();

    }

    //Polimorfism Static Overload ( una are parametru si cealalta nu are, diferenta se face prin nr
    // de parametri sau tipul)
    public void afiseazaMasini() {
        System.out.println("Nu avem masini");
    }

    public void afiseazaMasini(String brand) {
        System.out.println("Nu avem masini");

    }

    public void afiseazaMasini(String brand, Integer an) {
        System.out.println("Nu avem masini");

    }

    public void afiseazaMasini(Integer brand) {
        System.out.println("Nu avem masini");

    }

    //Polimorfism static la metode cu return = se poate aplica doar la metodele cu return care au
    //parametrii (ex: Integer, String) . Nu are nici o importanta nr parametrilor sau tipul parametrilor
    //La cele care nu au parametrii nu se poate aplica metode cu "return"


    public String getNume(){
        return "Paula";

    }

    public String getNume(Integer parametru){
        return "Paula";

    }

    public String getNume(String parametru){
        return "Paula";

    }







}


