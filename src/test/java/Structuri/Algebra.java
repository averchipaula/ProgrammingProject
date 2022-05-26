package Structuri;

import org.junit.Test;

public class Algebra {

    @Test
    public void Algebratest(){
    PrinteazaNumere();
    PrinteazanrWhile();
    PrinteazaPar(20);



    }
    //Printam primele 50 de numere (cu FOR)
    // in programare incepem sa numaram de la 0
    public void PrinteazaNumere(){
    for(Integer index=0; index<51;index++){
        System.out.println(index);


    }


    }

    //For are nr finit de pasi
   //While are nr infinit de pasi
    public void PrinteazanrWhile(){
        Integer index=0;
        while (index<51){
            System.out.println(index);
            index++;

        }

    }

    //Printeaza numerele pare de la 0 la un numar
    public void PrinteazaPar(Integer capat){
        for (Integer index=0; index<capat+1; index++){
            if(index%2==0){
                System.out.println(index);
            }
        }
    }





}
