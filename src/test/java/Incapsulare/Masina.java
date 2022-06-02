package Incapsulare;

public class Masina {

    //public, private, protected = java
    //private= cand scr. ceva intr-o clasa sa ramana privat in acea clasa
    //get=da set=modifica
    //se utilizeaza "private" de la inceput si apoi hotaram ce facem cu ele
    //Incapsulare = conceptul prin care tinem departe de exterior valorile variabilelor
    //Private = acess control care blocheaza valorile variabilelor sa fie vazute inafara clasei in
    // care am declarat-o
    //Ca sa vedem/modificam valorile folosim conceptul de "get" si "set"


    private String brand;
    private String model;
    private Integer pret;

    //Polimorfism = dinamic si static
    //P Dinamic = intr-o ierarhie de clase optinute prin mostenire o metoda poate
    //avea implementari diferite
    //P Static= mai multe metode cu acelasi nume se pot diferentia prin numarul de parametrii
    //si tipul parametrilor
    //P Dinamic = Override
    //P Static = Overload
    //Polimorfismul static nu se poate aplica la metodele cu "return"



    public Masina(String brand, String model, Integer pret) {
        this.brand = brand;
        this.model = model;
        this.pret = pret;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getPret() {
        return pret;
    }

    public void setModel(String model) {
        this.model = model;

    }

    //Definim o metoda pe care o vom suprascrie (override)
    public void cumparaMasina(){
        System.out.println("Vreau sa cumpar o masina: ");

    }




}


