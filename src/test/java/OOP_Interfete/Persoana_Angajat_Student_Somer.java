package OOP_Interfete;

public class Persoana_Angajat_Student_Somer extends Persoana_Interfata implements Angajat, Student, Somer{
    public Persoana_Angajat_Student_Somer(String nume, String prenume, String meserie) {
        super(nume, prenume, meserie);
    }

    @Override
    public void Munceste() {
        System.out.println("Angajat/Student/Somer" + getNume() +""+ getPrenume() + "munceste");

    }

    @Override
    public void PrimesteSalar() {
        System.out.println("Angajat/Student/Somer" + getNume() +""+ getPrenume() + "primeste salar");

    }

    @Override
    public void Someaza() {
        System.out.println("Angajat/Student/Somer" + getNume() +""+ getPrenume() + "someaza");

    }

    @Override
    public void PrimesteAjutor() {
        System.out.println("Angajat/Student/Somer" + getNume() +""+ getPrenume() + "primeste ajutor");

    }

    @Override
    public void Invata() {
        System.out.println("Angajat/Student/Somer" + getNume() +""+ getPrenume() + "invata");

    }

    @Override
    public void PrimesteBursa() {
        System.out.println("Angajat/Student/Somer" + getNume() +""+ getPrenume() + "primeste bursa");

    }
}
