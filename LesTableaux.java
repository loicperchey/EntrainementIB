import java.util.*;
import java.util.ArrayList.*;

public class LesTableaux {
//Loic
    //variable de classe
    static String[] monTableau = {"sardine", "morue", "bar", "daurade", "requin"}; 

    public static void showArray(String tab[])
    {

        Integer sizeTableau = tab.length;
        System.out.println("La taille du tableau est de :" +    sizeTableau);

        for(int i=0; i<sizeTableau; i++)
        {
            String element = tab[i];
            System.out.println(String.format( "n° %d : %s", i, element));
        }

        for(String element : tab) {
            System.out.println( element);
        }

    }
    
    public static void main(String[] args) {
        //variable locale
   String[] nomPoissons = {"sardine", "morue", "bar", "daurade", "requin"}; 
        showArray(nomPoissons);
    String[] nomOiseau = {"pivert", "pie", "merle", "kiwi", "corbeau"}; 
    

     showArray(nomOiseau);
    }
}