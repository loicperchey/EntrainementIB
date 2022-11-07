import java.util.*;
import java.util.ArrayList.*;

public class LesTableauxDynamiques {
//Loic
    //variable de classe
    
    public static void main(String[] args) {
        
    
        ArrayList<String> nomTableauPoissons = new ArrayList<>(); 
        nomTableauPoissons.add("sardine");
        nomTableauPoissons.add("maquereau");
        nomTableauPoissons.add("morue");
        nomTableauPoissons.add("espadon");
        nomTableauPoissons.add("tétradon");

        //get size of dynamic array
        Integer sizeOfArray = nomTableauPoissons.size();
        System.out.println(sizeOfArray);

        for (int i =0; i < sizeOfArray; i++)
        {
            String poisson = nomTableauPoissons.get(i);
            System.out.println( String.format( "n° %d : %s", i, poisson));

        }

        for (String poisson : nomTableauPoissons)
        {
            System.out.println( poisson);

        }

     
    }
}