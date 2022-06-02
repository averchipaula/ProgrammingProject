package OOPMostenire;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class HandbalTest {

    @Test

    public void mostenireHandbal(){
    //primult copil pentru Handbal
        List<String> ReguliHandbal= new ArrayList<>();
        ReguliHandbal.add("Nu ai voie sa ..");
        ReguliHandbal.add("Nu ai voie sa ... ");
        ReguliHandbal.add("Nu ai voie sa ....");

        Handbal Handbalsport= new Handbal("Handbal","Sport de echipa",
                true, 7,true,4,ReguliHandbal);

         Handbalsport.InfoSport();
         Handbalsport.InfoHandbal();



    }
}
