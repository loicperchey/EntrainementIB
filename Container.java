import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class  Container {
    // Loic
    
    static ArrayList<String> pays = new ArrayList<>(Arrays.asList("belgique", "espagne"));
    public static void main(String[] args) {

       
            
                pays.add("italie");
                pays.add("monaco");
                pays.add("andorre");
                pays.add("vatican");
                pays.add("lienchestein");
                pays.add("Saint Marin");
                pays.add("italie");

                int nrbElem = pays.size();
                System.out.println(nrbElem);

        for (int i = 0; i < pays.size(); i++)
        {
            System.out.println( pays.get(i));

            }

            for (String payss : pays)
            {
                System.out.println( payss);
    
                }
        pays.add("malte");
     
            int position = pays.indexOf("andorre");

            pays.remove("position");

            System.out.println("--------------------------");

            pays.remove("italie");

            for (String payss : pays)
            {
                System.out.println( payss);
    
                }

            }
        
    }


