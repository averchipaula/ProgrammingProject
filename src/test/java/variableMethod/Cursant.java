package variableMethod;

import org.junit.Test;


public class Cursant {
    //acesta este un cometariu
    /*acesta este un alt fel de comentariu*/
    //Class= o colectie de variable si metode
    //Intr-un fisier Java putem avea mai multe clase
    //Recunoastem o clasa dupa cuvantul cheie "class"
    //Structura clasa= public class Nume{}
    //Orice structura invatam trebuie scrisa in interiorul unei clase (Java)
    //O variabila trebuie sau nu sa primeasca o valoare
    //Dam o valoare unei variabile cu =
    public String Nume;
    public String Prenume;
    public Integer Varsta;
    public String Ocupatie;
    public Character Sex;
    public Double Inaltime;
    public Boolean esteAngajat;

    //Metoda= actiunea unei clase
    //O clasa poate sa contina sau nu n metode
    //Tipuri metode: void si return
    //Structura metoda void= public void Nume (){}
    //Metodele pot sau nu sa contina parametrii

    @Test
    public void AtribuireVariabile() {

        //Dam valori pentru variabilele de mai sus
        Nume = "averchi";
        Prenume = "paula";
        Varsta = 31;
        Ocupatie ="tester";
        Sex = 'F';
        Inaltime = 1.74;
        esteAngajat = true;


        //Printam o valoare in consola
        System.out.print("Nume");
        System.out.print (' ');
        System.out.print("Prenume");
        System.out.print (' ');
        System.out.print(Varsta);
        System.out.print (' ');
        System.out.print(Ocupatie);
        System.out.print (' ');
        System.out.print(Sex);
        System.out.print (' ');
        System.out.print(Inaltime);
        System.out.print (' ');
        System.out.println(esteAngajat);
        //Print versus Println
        //Print= printeaza si ramane pe randul curent
        //Println= printeaza si sare la randul urmator
        printeazaNota();
        promovareCurs();

        System.out.println(getSalar());

    }

    //variabila locala= tip variabila + nume
    public void printeazaNota(){
        Integer notamanual = 10;
        Integer notaautomation = 9;
        System.out.println("Cursantul Paula a luat notele:"+notamanual+" ,"+notaautomation);


    }

    public void promovareCurs(){
        Boolean promovare= true;
        System.out.print("A promovat cursantul:"+Nume+" "+Prenume+"?");
        System.out.println(promovare);

    }

    //Metoda return= exprimare care contine "returneaza"
    //Structura metoda return= public+  "tip de data" +Nume () {}
    //Exista o conventie in Java ca metodele cu return sa aiba in fata "get"
    //Returnam salaru dorit

    public String getSalar(){
        Integer salar=1000000;
        String s=salar +" Lei";
        return s; }

    public Integer getSalarV1(){
            Integer salar=5000;
            return salar;

        }



}
