import java.sql.ResultSetMetaData;
import java.util.*;
import java.util.ArrayList.*;

public class ConvertDecimal {
//Loic
    //variable de classe
    
    public static int convert(String str)
    {
        int resultat = 0;
        
        for (int i =0; i < str.length(); i++)
        {
          char lettre = str.charAt(i);
          int codeZero = ((int)'0');
          resultat *= 10;
          resultat += ((int)lettre) - codeZero;
        
          

        }
        return resultat;
    }

    public static void main(String[] args) {

        String v1Str="10";
        String v2Str="3";

        int v3=Integer.parseInt(v1Str);
        int v4=3;


        System.out.println("add v1+v2 :" + (v1Str + v2Str));
        System.out.println("add v3+v4 :" + (v3 + v4));

        System.out.println(String.format("my Convert %d ", convert("5")));
        System.out.println(String.format("my Convert %d ", convert("12")));
}
}
