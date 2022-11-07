import java.util.*;
import java.util.ArrayList.*;

public class ChaineTableau {
//Loic
    //variable de classe
    
    public static void main(String[] args) {
        
        String str = "heureux comme un poisson dans l'eau à la mer";
        Integer sizeOfString = str.length();
        System.out.println("Taille de la chaîne :" + sizeOfString);


        for (int i = 0; i < sizeOfString; i++)
        {
            char caractere = str.charAt(i);
            int codeASCII = (int)caractere;
            int codeMajASCII_MIN = ((int)'a' - (int)'A');
            int codeMajASCIIMAJ = codeASCII - codeMajASCII_MIN;
            System.out.println( String.format( "n° %2d : %1c %3d %1c", i, caractere, codeASCII, codeMajASCIIMAJ));

            //test

        }
     
    }
}