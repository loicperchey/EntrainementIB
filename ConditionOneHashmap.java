import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class  ConditionOneHashmap {
    // Loic
    static HashMap<String, String> sportDict = new HashMap<String, String>() {
        {
            put("toto", "emmerder");
            put("jean", "chieur");
            put("Sigismond", "joute");
            put("Gontrand", "bridge");
            put("titi", "ski");
        }
    };
    public static String quelSportFait(String nom){
      return sportDict.get(nom);
    }

    
    public static void main(String[] args) {

        String nom = "toto";
       

        System.out.println( String.format(" %s fait du %s " , nom, quelSportFait(nom)));

    }
}


/*
 * 
    toto -> tennis
    jean -> velo
    Sigismond -> joute
    Gontrand  -> bridge
    titi -> ski
 * 
 * 
 */