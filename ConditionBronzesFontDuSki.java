import java.util.ArrayList;

class  ConditionBronzesFontDuSki {
    // Loic

    public static String queFaitIlElle(String nom){
        String sport="";
        switch(nom){
        case "Nathalie Morin" :
            sport="Elle gueule";
            break;
        case "Jean-Claude Dusse" :
            sport="La loose";
            break;
        case "Gigi " :
            sport="Servir des crêpes";
            break;
        case "Jérôme Tarayre" :
            sport="Perdre sa licence";
            break;
        case "Bernard Morin":
            sport="On sait pas";
            break;
        case "Popeye":
            sport="Se faire avoir dans son magasin";
            break;
        case"":
            sport="rien";
            break;
        }
        return sport;
    }

    public static void main(String[] args) {

        String nom = "Jean-Claude Dusse";
       

        System.out.println( String.format(" %s fait du %s " , nom, queFaitIlElle(nom)));

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