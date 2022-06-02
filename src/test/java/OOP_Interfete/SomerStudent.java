package OOP_Interfete;

public class SomerStudent extends Persoana_Interfata implements Somer{

    public SomerStudent(String nume, String prenume, String meserie) {
        super(nume, prenume, meserie);
    }

    @Override
    public void Someaza() {
        System.out.println("Somerul" + getNume() +""+ getPrenume() + "someaza");

    }

    @Override
    public void PrimesteAjutor() {
        System.out.println("Somerul" + getNume() +""+ getPrenume() + "primeste ajutor");

    }
}
