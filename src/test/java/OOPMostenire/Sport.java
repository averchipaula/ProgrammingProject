package OOPMostenire;

public class Sport {
    public String Nume;
    public String Denumire;
    public Boolean esteEchipa;
    public Integer NrMembri;

    public Sport(String nume, String denumire,
                 Boolean esteEchipa, Integer nrMembri) {
        Nume = nume;
        Denumire = denumire;
        this.esteEchipa = esteEchipa;
        NrMembri = nrMembri;
    }

    //OOP Mostenire = principiul pe baza caruia clasa parinte
    //poate sa fie mostenita de N Clase copii.
    //Exemplu: casa bunicilor cu nepotii.
    //In Java putem mosteni o singura clasa
    //In momentul in care clasa copil mosteneste clasa parinte
    //trebuie sa apelam constructorul din clasa parinte.

    public void InfoSport(){
        System.out.println(Nume);
        System.out.println(Denumire);
        System.out.println(esteEchipa);
        System.out.println(NrMembri);
    }
}
