import java.sql.ResultSetMetaData;
import java.util.*;
import java.util.ArrayList.*;

public class ChaineToUpper {
//Loic
    //variable de classe
    
    public static String chainMAJ(String str)
    {
  
       String resultat="";
       int codeMajASCII_MIN = ((int)'a' - (int)'A');

        for (int i = 0; i < str.length(); i++)
        {
            char caractere = str.charAt(i);
            int codeASCII = (int)caractere;
            if( codeASCII>=97 && codeASCII <= 122){
                int codeMajASCIIMAJ = codeASCII - codeMajASCII_MIN;
                resultat+= (char)codeMajASCIIMAJ;
            }
            else if(codeASCII==(int)'à')
            {
                codeASCIIMAJ=(int)'A';
                resultat += (char)codeASCIIMAJ;
            }
            else
            {
                resultat += (char)codeASCII;
            }
        }
        return resultat;
    }
    public static void main(String[] args) {
        
        String str = "heureux comme un poisson dans l'eau à la mer";
     String resultat = chainMAJ(str);
     System.out.println(resultat);
    }
}