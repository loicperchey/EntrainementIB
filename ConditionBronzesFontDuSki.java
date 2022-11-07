import java.util.ArrayList;

class  ConditionBronzesFontDuSki {
    // Loic

    public static String queFaitIlElle(String nom){
        String sport="";
        switch(nom){
        case "Nathalie Morin" :
            sport="Elle gueule";
        case "Jean-Claude Dusse" :
            sport="La loose";
        case "Gigi " :
            sport="Servir des crêpes";
        case "Jérôme Tarayre" :
            sport="Perdre sa licence";
        case "Bernard Morin":
            sport="On sait pas";
        case "Popeye":
            sport="Se faire avoir dans son magasin";
        case"":
            sport="rien";
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