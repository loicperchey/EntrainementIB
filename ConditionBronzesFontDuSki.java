import java.util.ArrayList;

class  ConditionBronzesFontDuSki {
    // Loic

    public static String queFaitIlElle(String nom){
        String sport="";
        switch(nom){
        case "Nathalie Morin" :
            sport="";
        case "Jean-Claude Dusse" :
            sport="";
        case "Gigi " :
            sport="";
        case "Jérôme Tarayre" :
            sport="";
        case "Bernard Morin":
            sport="";
        case "Popeye":
            sport="";
        case"":
            sport="rien";
        }
        return sport;
    }

    public static String choixDeLactivite(String nom){
        String sport="";
        if(nom=="Nathalie Morin"){
            sport="";
        }
        else if(nom=="Jean Claude Dusse"){
            sport="";
        }
        else if (nom=="Gigi"){
            sport="";
        } 
           
        else if (nom=="Jérôme Tarayre"){
            sport="";
        }
        else if (nom=="Bernard Morin"){
            sport="";
        }
        else if (nom=="Popeye"){
            sport="";
        }
        else{
            sport="aucun";
        }
        return sport;
       
    }
    public static void main(String[] args) {

        String nom = "toto";
       

        System.out.println( String.format(" %s fait du %s " , nom, choixDuSport(nom)));

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