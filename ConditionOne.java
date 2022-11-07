import java.util.ArrayList;

class  ConditionOne {
    // Loic

    public static String quelSportFait(String nom){
        String sport="";
        switch(nom){
        case "toto" :
            sport="tennis";
            break;
        case "jean" :
            sport="velo";
            break;
        case "Sigismond" :
            sport="joute";
            break;
        case "Gontrand" :
            sport="bridge";
            break;
        case "titi":
            sport="ski";
            break;
        case "":
            sport="rien";
            break;
        }
        return sport;
    }

    public static String choixDuSport(String nom){
        String sport="";
        if(nom=="toto"){
            sport="tennis";
        }
        else if(nom=="jean"){
            sport="velo";
        }
        else if (nom=="Sigismond"){
            sport="joute";
        } 
           
        else if (nom=="Gontrand"){
            sport="bridge";
        }
        else if (nom=="titi"){
            sport="ski";
        }
        else{
            sport="aucun";
        }
        return sport;
       
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