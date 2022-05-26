package Homework;

import org.junit.Test;

public class Tema1{

    //Pentru fiecare linie se declara variabile noi
    //Hello Word
    //Varsta
    //Numele si Prenumele pe doua randuri
    //Care ii data de astazi? 19/5/2022
    //Cat e ceasul? 18:37
    //Printeaza zilele Marti/Joi

    public String Mesaj;
    public Integer Varsta;
    public String Nume;
    public String Prenume;
    public String Data;
    public String Ora;
    public String Zile;

    @Test

    public void CerinteTema(){
        Mesaj();
        Varsta();
        Nume();
        Prenume();
        Data();
        Ora();
        Zile();
        SumDoubles();
        IntegerNumere();
        SalutM();
        SalutP();
        HHello();
        PrinteazaText();
        Printeazasir();
        Rezultatul();
        HelloWord();

      }

     //Hello Word
    public void Mesaj(){
        Mesaj="Hello Word";
        System.out.println("Hello Word");
        System.out.println("Poti pleca acasa dupa ce iti verific munca");

      }
      //Hello word with Array
      public void HelloWord(){
          String[] List= new String [2];
          List[0]="Hello";
          List[1]="Word";

          for(Integer index=0; index<List.length; index++ ){
              System.out.println(List [index]);
          }
      }

    //Varsta
    public void Varsta(){
        Varsta=31;
        System.out.println(31);
        System.out.println("Poti pleca acasa dupa ce iti verific munca");

     }

    //Nume
    public void Nume(){
        Nume="Averchi";
        System.out.println("Averchi");
     }

    public void Prenume(){
        Prenume="Paula";
        System.out.println("Paula");
        System.out.println("Averchi " +"Paula");
        System.out.println("Poti pleca acasa dupa ce iti verific munca");
     }

    //Data
    public void Data(){
        Data=("19.5.2022");
        System.out.println("Care este data de astazi?");
        System.out.println("19.5.2022");
        System.out.println("Poti pleca acasa dupa ce iti verific munca");
     }

    //Ora
    public void Ora(){
        Ora=("18:37");
        System.out.println("Cat este ceasul?" +" 18:37");

        System.out.println("Poti pleca acasa dupa ce iti verific munca");

     }

    //Zile
    public void Zile(){
        Zile=("Marti si Joi");
        System.out.println("In ce zile mergi la curs?");
        System.out.println("Marti si Joi");
        System.out.println("Poti pleca acasa dupa ce iti verific munca");
     }

     //Cat face [2+(3*4)-3]/3 ?
     //Rezultatul corect este: {rezultatul}
    public void Rezultatul(){
        Integer x1=2;
        Integer x2=3;
        Integer x3=4;
        Integer sum=x1+x2*x3;
        System.out.println("Suma este="+sum);
        Integer x4=3;
        Integer sum1=sum-x3;
        System.out.println("Suma este="+sum1);
        Integer x5=3;
        Integer sum2=sum1/3;
        System.out.println("Suma este=" +sum2);
        System.out.println("Poti pleca acasa dupa ce iti verific munca");


    }

    //afiseaza pe ecran suma a 3 numere double intr-o variabila de acelasi tip +mesaj
   public void SumDoubles(){
        double d1=10.3;
        double d2=12.33;
        double d3=50.12;
        double sum=d1+ d2+ d3;
        System.out.println("SumDoubles = " +sum +  " Rezultatul este double ");
       System.out.println("Poti pleca acasa dupa ce iti verific munca");


    }

   //Afiseaza pe ecran produsu a 2 numere integer intr-o variabila de acelasi tip+mesaj
    public void IntegerNumere(){
        Integer x1=45;
        Integer x2=30;
        Integer sum=x1+ x2;
        System.out.println("IntegerNumere = " +sum + " Rezultatul este integer");
        System.out.println("Poti pleca acasa dupa ce iti verific munca");
     }


    // concateneaza la valoarile rezultate de mai sus mesajul "Stiu ca am calculat bine" si
    // afiseaza-l pe ecran cu tot cu rezultatul calculului
    public void Printeazasir(){
        Integer suma=75;
        Double suma2=72.75;
        String text="Stiu ca am calculat bine";
        System.out.println(+suma+ ","+suma2+" Stiu ca am calculat bine");
        System.out.println("Poti pleca acasa dupa ce iti verific munca");


    }


// Adauga la "Salut" caracterul "M" la final
    public void SalutM(){
        String SalutM="SalutM";
        System.out.println("SalutM");
        System.out.println("Poti pleca acasa dupa ce iti verific munca");



     }

    //o alta varianta la mesajul SalutM
    public void SalutP(){
        String Salut="Salut";
        String SalutP="SalutP";
        System.out.println("Salut" +"P");
        System.out.println("Poti pleca acasa dupa ce iti verific munca");


     }

    //Adauga la "Hello" caracterul "H" la inceput
    public void HHello(){
        String Hello="H";
        String HHello="HHello";
        System.out.println("H"+ "Hello");
        System.out.println("Poti pleca acasa dupa ce iti verific munca");

     }

    //Adauga la "Ana are mere,pere,prune" dupa fiecare vocala de la final caracterul "Z"
   public void PrinteazaText(){
        String Anaaremere="Ana are mere,";
        String pereprune="pere,prune";
        System.out.println("AnaZ areZ mereZ,pereZ,pruneZ");
        System.out.println("Poti pleca acasa dupa ce iti verific munca");

    }














    }













