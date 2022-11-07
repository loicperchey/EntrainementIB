import java.util.Scanner; // Import the Scanner class
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;


class TrouverLeChiffre {
    // Loic

    public static void main(String[] args) {

        Scanner saisie = new Scanner(System.in); // Create a Scanner object sur l'entrée standard alias le clavier alias
        Random rand = new Random();

        // init du jeu
        int nombreADecouvrir = ThreadLocalRandom.current().nextInt(1, 10 + 1);
        int essaie = 2;
        int chiffreChoisi=0;
        while( true )
        {
            System.out.print("entrez un chiffre entr 1 et 10 : ");
            String textSaisi = saisie.nextLine(); 
            try
            {
                chiffreChoisi = Integer.parseInt(textSaisi); 
            }
            catch( NumberFormatException nfe )
            {
                System.out.println("vous devez saisir un chiffre entre ente 1 et 10.");
            }

            if( chiffreChoisi > nombreADecouvrir )
                System.out.println("trop grand !");
            else if( chiffreChoisi < nombreADecouvrir )
                System.out.println("trop petit !");
            else 
            {
                System.out.println("gagné !");
            }
           
            if ( ++essaie >= 10 )
            {
                System.out.println("nombre d'essais épuisé !");
            }
            System.out.println("Voulez-vous continer (true ou false)?");
                boolean continuer = saisie.nextBoolean();
                if(continuer=true){
                    continue;
                }
                else if(continuer=false){
                    break;
                }
        }
       saisie.close();
    }
}