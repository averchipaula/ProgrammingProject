package OOP_Abstract;

public abstract class PersoanaAbstract {
    //Abstractizare = conceptul pe baza caruia definim comportamentul unei clase
    //Recunoastem o clasa abstracta dupa cuvantul abstract
    //Clasa abstracta poate sau nu sa contina metode abstracte
    //O clasa poate extinde o clasa abstracta
    //O clasa abstracta poate sa implementeze o interfata
    //Poti sa mostenesti o singura clasa abstracta
    //Clasa care mosteneste clasa abstracta => implementeaza toate metodele abstracte
    //Clasa abstracta poate sa contina un constructor => nu poti crea obiecte
    //O clasa extinde o singura clasa

    abstract void Munceste();
    abstract void PrimesteSalar();
    abstract void Invata();
    abstract void PrimesteBursa();
    abstract void Someaza();
    abstract void PrimesteAjutor();

    //metoda abstracta poate sau nu sa contina
    public void VerificaVarsta(Integer Varsta){
        if (Varsta>=18){
            System.out.println("Persoana e majora");
        }
        else{
            System.out.println("Persoana e minora");
        }
    }


}
