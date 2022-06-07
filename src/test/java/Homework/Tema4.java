package Homework;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tema4 {
    //AN* *RE M*R*
    @Test
    public void PrinteazaProp(){
        String s1="An*";
        String replaceString=s1.replace('*','a');
        System.out.println(replaceString);
        String s2="*re";
        String ReplaceString=s2.replace('*', 'a');
        System.out.println(ReplaceString);
        String s3="m*r*";
        String RepString=s3.replace('*','e');
        System.out.println(RepString);
        System.out.println(replaceString + " " +ReplaceString + " " +RepString);


    }


}














