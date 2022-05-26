package ObiectConstructor;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

    //Obiect=instanta unei clase
    //Obiectul este strict legat de constructor
    //Dintr-o clasa putem declara N obiecte
    //Obiectele se diferentiaza pe baza numelui
    //Structura obiect:
    // -nume clasa + nume obiect = new nume clasa (valori parametri)
    //Recunoastem un obiect dupa cuvantul "new"

    @Test
    public void MetodaTest(){
        //Primul obiect


        List<Integer> noteRomanaPaula = new ArrayList<>();
        noteRomanaPaula.add(10);
        noteRomanaPaula.add(8);
        noteRomanaPaula.add(9);
        List<Integer> noteMatematicaPaula = new ArrayList<>();
        noteMatematicaPaula.add(7);
        noteMatematicaPaula.add(6);
        noteMatematicaPaula.add(9);
        noteMatematicaPaula.add(5);
        Student AverchiPaula=new Student("Averchi","Paula",
          31,1.74 ,'F',true,
                noteMatematicaPaula,noteRomanaPaula);
        AverchiPaula.InfoStudent();
        AverchiPaula.InfoNote("romana");
        AverchiPaula.InfoNote("Matematica");
        AverchiPaula.Prenume="Daniela";
        AverchiPaula.InfoStudent();

        List<Integer> noteRomanaAlex = new ArrayList<>();
        noteRomanaAlex.add(5);
        noteRomanaAlex.add(5);
        noteRomanaAlex.add(5);
        List<Integer> noteMatematicaAlex = new ArrayList<>();
        noteMatematicaAlex.add(6);
        noteMatematicaAlex.add(6);
        noteMatematicaAlex.add(6);
        noteMatematicaAlex.add(9);

        Student DorhaAlex=new Student("Dorha","Alex",
                27,1.80 ,'M',false,
                noteMatematicaAlex,noteRomanaAlex);
        DorhaAlex.InfoStudent();
        DorhaAlex.InfoNote("Matematica");
        DorhaAlex.InfoNote("Romana");


        //Declaram un obiect pentru al doilea constructor

        List<Integer> noteMatematicaCla = new ArrayList<>();
        noteMatematicaCla.add(6);
        noteMatematicaCla.add(6);
        noteMatematicaCla.add(6);
        noteMatematicaCla.add(9);

        Student PopCla=new Student("Pop","Cla",
                27,1.80 ,'M',false,
                noteMatematicaCla);
        PopCla.InfoStudent();
        PopCla.InfoNote("Matematica");

        // declaram un obiect pt al treilea constructor

        List<Integer> noteMaghiaraJohn = new ArrayList<>();
        noteMaghiaraJohn.add(6);
        noteMaghiaraJohn.add(6);
        noteMaghiaraJohn.add(6);
        noteMaghiaraJohn.add(9);
        List<Integer> noteRomanaJohn = new ArrayList<>();
        noteRomanaJohn.add(5);
        noteRomanaJohn.add(5);
        noteRomanaJohn.add(5);
        List<Integer> noteMatematicaJohn = new ArrayList<>();
        noteMatematicaJohn.add(6);
        noteMatematicaJohn.add(6);
        noteMatematicaJohn.add(6);
        noteMatematicaJohn.add(9);

        Student IonescuJohn=new Student("Ionescu","John",
                31,1.74 ,'F',true,
                noteMatematicaJohn,noteRomanaJohn,noteMaghiaraJohn);

        IonescuJohn.InfoNote("Maghiara");
        IonescuJohn.InfoStudent();
        IonescuJohn.CalculMedie("Matematica");








    }
}
