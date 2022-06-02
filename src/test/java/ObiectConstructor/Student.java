package ObiectConstructor;

import java.util.List;

public class Student {

    public String Nume;
    public String Prenume;
    public Integer Varsta;
    public Double Inaltime;
    public Character Sex;
    public Boolean areBursa;
    public List<Integer> noteMatematica;
    public List<Integer> noteRomana;

    public List<Integer> noteMaghiara;

    //Obiect = Instanta unei clase
    //Constructor = Are ca rol sa initializeze variabilele unei clase
    //Tipuri constructor = cu parametri si fara parametri
    //By default avem un constructor fara parametri in orice clasa
    //Intr - o clasa putem avem N constructor
    //Stuctura constructor: public numele clasei(are sau nu parametri)
    //Nu exista constructor cu "return"
    //Obiectul este legat de constructor



    public Student(String nume, String prenume, Integer varsta,
                   Double inaltime, Character sex, Boolean areBursa,
                   List<Integer> noteMatematica, List<Integer> noteRomana) {
        Nume = nume;
        Prenume = prenume;
        Varsta = varsta;
        Inaltime = inaltime;
        Sex = sex;
        this.areBursa = areBursa;
        this.noteMatematica = noteMatematica;
        this.noteRomana = noteRomana;
    }

    //Facem un alt constructor doar cu note Matematica


    public Student(String nume, String prenume, Integer varsta, Double inaltime, Character sex, Boolean areBursa, List<Integer> noteMatematica) {
        Nume = nume;
        Prenume = prenume;
        Varsta = varsta;
        Inaltime = inaltime;
        Sex = sex;
        this.areBursa = areBursa;
        this.noteMatematica = noteMatematica;
    }
     // al treilea constructor

    public Student(String nume, String prenume, Integer varsta, Double inaltime, Character sex, Boolean areBursa,
                   List<Integer> noteMatematica, List<Integer> noteRomana, List<Integer> noteMaghiara) {
        Nume = nume;
        Prenume = prenume;
        Varsta = varsta;
        Inaltime = inaltime;
        Sex = sex;
        this.areBursa = areBursa;
        this.noteMatematica = noteMatematica;
        this.noteRomana = noteRomana;
        this.noteMaghiara = noteMaghiara;
    }

    public void InfoStudent(){
        System.out.println("Numele studentului este "+Nume);
        System.out.println("Prenumele studentului este " +Prenume);
        System.out.println("Varsta studentului este "+Varsta);
        System.out.println("Inaltimea studentului este: " + String.format("%.2f", Inaltime));
        System.out.println("Sexul studentului este "+Sex);
        System.out.println("Are studentul bursa? "+areBursa);


    }

    public void InfoNote(String Materie){
        if(Materie.equals("romana") || Materie.equals("Romana")){
            System.out.println("Notele studentului la romana sunt urmatoarele: ");
            PrintNoteLista(noteRomana);
        }

        if(Materie.equals("matematica") || Materie.equals("Matematica")){
            System.out.println("Notele studentului la matematica sunt urmatoarele: ");
            PrintNoteLista(noteMatematica);
        }

        if(Materie.equals("maghiara") || Materie.equals("Maghiara")){
            System.out.println("Notele studentului la maghiara sunt urmatoarele: ");
            PrintNoteLista(noteMaghiara);
        }
    }

    public void PrintNoteLista(List<Integer> note){
        for(Integer index=0; index<note.size();index++ ){
            System.out.println(note.get(index));
        }
    }

    public void CalculMedie(String Materie){
        if(Materie.equals("matematica") || Materie.equals("Matematica")){
            System.out.println("Media studentului la matematica este: ");
            PrintCalculMedie(noteMatematica);
        }
        if(Materie.equals("romana") || Materie.equals("Romana")){
            System.out.println("Media studentului la romana este: ");
            PrintCalculMedie(noteRomana);
        }
        if(Materie.equals("maghiara") || Materie.equals("Maghiara")){
            System.out.println("Media studentului la maghiara este: ");
            PrintCalculMedie(noteMaghiara);
        }
    }

    public void PrintCalculMedie(List<Integer> note){
        double suma= 0;
        Integer nrelemente=note.size();

        for(Integer index=0; index<note.size();index++ ){
            suma=suma+note.get(index);
        }

        double Medie=suma/nrelemente;
        System.out.println(Medie);
    }


}
