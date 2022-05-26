package Homework;

import org.junit.Test;

public class Tema2 {

    @Test

    public void structuritema() {

        //CitimNumere();
        //PrintYes();
       // NumereDivizibile(12);
       // PrimeletreiDiv(15);
       // Numerepositivepare();
        //SumaNumerelor();
        //Produsulnr();
        //DivNr();
        //Divcucinci();
        //NrPare();
        SumaNumerelor();
        Prodegal();




    }

    //Citim 3 numere cu valori diferite.Daca suma primelor 2 numere este mai mare decat al 3 lea numar
    //afisam un mesaj corespunzator +valoarea sumei, altfel afisam contrariul
    public void CitimNumere() {
        Integer a=4;
        Integer b =7;
        Integer c=12;

        if(a+b>=c){
            System.out.println("Daca suma numerelor " + (a+b) +"este mai mare decat "+ (c)+ "afisam rezultatul");
        }
        else {
            System.out.println("Suma numerelor " +(a+b)+" este mai mica decat "+ (c));

        }


    }


    //Afiseaza de 5 ori cuvantul "DA" pe acelasi rand cu un spatiu intre
    public void PrintYes() {
        for (Integer index = 0; index < 1; index++) {
            System.out.println(" Da " + " Da " + " Da " + " Da "  +" Da ");

        }

    }

    // in While metoda 2 pentru "DA" ???






    // Primele 5 numere divizibile cu 3
    //0 3 6 9 12 15
    public void NumereDivizibile (Integer Number) {
        int num = 0;

        for (int index = 0; index <= 12; index++) {
            if (index % 3 == 0) {
                System.out.println(index);
                num++;
            }

            if (num == 0)
                break;


        }
    }

    // Metoda 2 in while //0 3 6 9 12
    public void DivNr(){
        Integer index=0;
        while(index <= 12) {
            if(index%3 == 0) {
                System.out.println(index);
            }
            index++;
        }
        }


    //Primele 3 numere divizibile cu 5 // 0 5 10 15
    public void PrimeletreiDiv(Integer Number) {
        int num = 0;

        for (int index = 0; index <= 15; index++) {

            if (index % 5 == 0) {

                System.out.println(index);
                num++;
            }

            if (num == 0)
                break;

        }

    }

     //Metoda 2 cu while, primele 3 numere div cu 5 //0,5,10
      public void Divcucinci(){
          Integer index=0;
          while(index <= 10) {
              if(index%5 == 0) {
                  System.out.println(index);
              }
              index++;
          }

      }


    //Primele 4 numere pozitive si pare //2 4 6 8
    public void Numerepositivepare() {
        Integer number = 8;
        System.out.println("List of even and pozitive numbers from 2 to 8");

        for (Integer index = 2; index <= number; index++) {

            if (index % 2 == 0) {
                System.out.println(index);
            }

        }


    }

    //Metoda 2, primele 4 nr pozitive si pare, 2 4 6 8
    public void NrPare(){
        Integer index = 1;

        System.out.println("Even numbers");
        while(index<=4){
            System.out.println(index * 2);
            index++;



        }


    }

    //Suma numerelor pana la 10 // 0+1+2+3+4+5+6+7+8+9+10=55
    public void SumaNumerelor() {
        Integer sum = 0;

        for (Integer index = 1; index <= 10; index++) {

            sum+=index;
        }

        System.out.println("Suma numerelor pana la 10 este = " + sum);

    }

    //Metoda 2 cu while //Suma nr pana la 10 , 0+1+2+3+4+5+6+7+8+9+10=55
    public void SumaNr(){
        Integer suma = 0;
        Integer index = 1;
        while (index < 10) {
            suma = suma + index;
            index++;
        }
        System.out.println(suma);
    }


    //Produsul numerelor pana la 5 // 0*1*2*3*4*5=120
    public void Produsulnr(){
        Integer a=1;
        Integer b=2;
        Integer c=3;
        Integer d=4;
        Integer e=5;
        Integer f=a*b*c*d*e;
        System.out.println("Produsul numerelor pana la 5 = " +f );



    }

    //Metoda 2 cu while ,  0*1*2*3*4*5=120
    public void Prodegal(){
        Integer produs = 1 ;
        Integer index=1;
        while( index <= 5) {
          produs  = produs * index;
          index++;
        }
        System.out.println(produs);

        }










    }





















