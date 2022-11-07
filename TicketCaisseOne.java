import java.util.*;
public class TicketCaisseOne {
    
    public static void main (String[]args){

        String[] articles ={"patate", "tomate", "oignons", "radis", "salade", "rose", "jasmin", "nénuphar", "oeillet", "tulipe", "rhododendron"};

        System.out.println(articles[0]);
        System.out.println(articles[2]);
        System.out.println(articles[articles.length-1]);

        for(int i=0; i < articles.length; i++){
            System.out.println(String.format(" article n° %2d -> %s", i+1, articles[i]));
        }

        int j = 0;
        for(String article : articles){
            System.out.println(String.format(" article n° %2d -> %s", j+1, article));
            j++;
        }

        String phrase = "Il fait soleil toto va à la pêche";

        Integer posToto = phrase.indexOf("toto");

        System.out.println(posToto);
    }
}
