package OOP_Interfete;

public class PersoanaSomerStudent extends Persoana_Interfata implements Student, Somer {

    public PersoanaSomerStudent(String nume, String prenume, String meserie) {
        super(nume, prenume, meserie);
    }


    @Override
    public void Someaza() {
        System.out.println("Somer/Student" + getNume() +""+ getPrenume() + "someaza");

    }

    @Override
    public void PrimesteAjutor() {
        System.out.println("Somer/Student" + getNume() +""+ getPrenume() + "primeste ajutor");

    }

    @Override
    public void Invata() {
        System.out.println("Somer/Student" + getNume() +""+ getPrenume() + "invata");

    }

    @Override
    public void PrimesteBursa() {
        System.out.println("Somer/Student" + getNume() +""+ getPrenume() + "primeste bursa");

    }

}



