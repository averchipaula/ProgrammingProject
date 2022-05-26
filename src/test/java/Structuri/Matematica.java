package Structuri;

import org.junit.Test;

public class Matematica {

    //Structuri=Alternative si Repetitive
    //Structuri alternative= IF ... THEN ... ELSE si Switch ... CASE

    @Test
    public void MatematicaTest (){
        numarMaiMareCa20();
        NumarPAr();
        numarMaiMareCaUnNumar(68, 18);
        numarMaiMareCaUnNumar(5, 10);
        VerificParitateNumar(21);
        VerificParitateNumar(64);
        VerificNumarImparDivizibilV2(5);
        VerificNumarImparDivizibilV2(9);
        VerificNumarImparDivizibilV2(10);
        VerificNumarImparDivizibilV2(14);
        VerificParitateNumar(9);
        PrinteazaZi("Duminica");

    }



    // Verificam daca un numar este mai mare ca 20
    public void numarMaiMareCa20()
    {
        if (38>20){
            System.out.println("Numarul 38 este mai mare ca 20 ");
        }
        else {
            System.out.println("Numarul 38 este mai mic decat 20 ");

        }

    }

    // Verificam daca un numar este par
    // "/" = este folosit in programare pt a reprezenta impartirea = se foloseste pentru cat
    // "%" = se foloseste pentru rest
    public void NumarPAr(){
        if (8%2==0){
            System.out.println("Numarul este par");

        }
        else {
            System.out.println ("Numarul este impar");

        }
    }

    public void numarMaiMareCaUnNumar(Integer Numar,Integer Comparatie)
    {
        if (Numar>Comparatie){
            System.out.println("Numarul " +Numar+" este mai mare ca " + Comparatie);
        }
        else {
            System.out.println("Numarul " +Numar+ " este mai mic decat " + Comparatie);

        }

    }

    // Verificam daca un numar este impar
    public void VerificParitateNumar(Integer Number){
        if (Number%2==0){
            System.out.println(Number + " este par");

        }
        else {
            System.out.println (Number + " este impar");

        }
    }

    // Verific daca un numar este impar si divizibil cu 5
    public void VerificNumarImparDivizibilV1(Integer Numar){
        if (Numar%2==1 && Numar%5==0){
            System.out.println(Numar +" este impar si divizibil cu 5");

        }
        else {
            System.out.println(Numar + " nu este impar si nici divizibil cu 5");

        }
    }
    public void VerificNumarImparDivizibilV2(Integer Numar){


        if (Numar%2==1){
            if (Numar%5==0){
                System.out.println(Numar+ " este impar si divizibil cu 5");
            }
            else {
                System.out.println(Numar + " este impar dar nu divizibil cu 5");
            }

        }
        else {
            if (Numar % 5 == 0) {
                System.out.println(Numar + " este par si divizibil cu 5");
            }
            else {
                System.out.println(Numar + " este par dar nu divizibil cu 5");

            }
        }

     }


     //Switch case pe zilele saptamanii
    public void PrinteazaZi(String ZiCurenta){
        switch (ZiCurenta){
            case "Duminica":
                System.out.println("Astazi este duminica");
                break;
            case "Luni":
                System.out.println("Astazi este luni");
                break;
            case "Marti":
                System.out.println("Astazi este marti");
                break;


        }

    }



}
