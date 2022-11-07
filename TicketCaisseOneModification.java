import java.util.*;
public class TicketCaisseOneModification {
    
    public static void main (String[]args){

        String[] articles ={"patate", "tomate", "oignons", "radis", "salade", "rose", "jasmin", "nénuphar", "oeillet", "tulipe", "rhododendron"};
        Double prixs[]    = {   1.5,      4.0,          1.6,      1.5,    1.0,       7.0,       14.0,        78.55,     5.5,        4.0,          19.99      }; 
        Double quantites[]    = {   3.0,     1.0,          1.0,      0.0,    1.0,      1.0,       0.5,        0.0,     1.1,        4.0,          19.99      }; 

        System.out.println(articles[0]);
        System.out.println(articles[2]);
        System.out.println(articles[articles.length-1]);

        
        for(int i=0; i <= articles.length; i++){
            System.out.println(String.format("article n° %20d -> %s  prix ->%6.2f quantité->%4.2f prix achat->%6.2f", i+1, articles[i], prixs[i], quantites[i], quantites[i]*prixs[i]));
        }

        
    }
}
