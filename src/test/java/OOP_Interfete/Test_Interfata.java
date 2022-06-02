package OOP_Interfete;

import org.junit.Test;

public class Test_Interfata {
    @Test

    public void metodaInterfata(){
        //Persoana angajat
        PersoanaAngajat persoanaAngajat = new PersoanaAngajat("Nume1", "Prenume1",
                "Angajat");
        persoanaAngajat.Munceste();
        persoanaAngajat.PrimesteSalar();

        //Persoana student
        PersoanaStudent persoanaStudent = new PersoanaStudent("Nume2", "Prenume2",
                "invata");
        persoanaStudent.Invata();
        persoanaStudent.PrimesteBursa();

        //Persoana angajat-student
        PersoanaStudentAngajat persoanaStudentAngajat = new PersoanaStudentAngajat("Nume3", "Prenume3",
                "angajat-student");
        persoanaStudentAngajat.Invata();
        persoanaStudentAngajat.Munceste();
        persoanaStudentAngajat.PrimesteBursa();
        persoanaStudentAngajat.PrimesteSalar();
        

    }
}
