import java.util.*;
import java.util.ArrayList.*;
//Loic
class ContainerJeu {
public static void jeu(){
  
    Scanner saisie = new Scanner(System.in); // Create a Scanner object sur l'entrÃ©e standard alias le clavier alias
                                                 // IN
        System.out.println("Enter username");
        String userName = saisie.nextLine(); // Read user input
        System.out.println("Username is: " + userName); // Output user input
        System.out.println("Le nombre de tentatives");
        int userNombreChances = saisie.nextInt(); // Read user input
       
        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive

        int randomNum;
        int nombreTentatives=0;
        randomNum = 1+(int)Math.random();
    while(nombreTentatives!=userNombreChances){
        System.out.println(String.format("%s, Quel est votre numéro ?", userName));
        int saisieUtilisateur = saisie.nextInt();
        nombreTentatives++;
        if(saisieUtilisateur==randomNum){
            System.out.println(String.format("%s, vous avez réussi en %d tentatives", userName, nombreTentatives));
            break;
        }
        else if(saisieUtilisateur!=randomNum){
            System.out.println(String.format("%s, veuillez réessayer, vous avez eu %d tentatives", userName, nombreTentatives));
            if(saisieUtilisateur<randomNum){
                System.out.println(String.format("%s, le chiffre est supérieur à votre chiffre", userName, randomNum));
            }
            else if(saisieUtilisateur>randomNum){
                System.out.println(String.format("%s,le chiffre est inférieur à votre chiffre", userName, randomNum));
            }
           
        }
        if(nombreTentatives>=userNombreChances){
            System.out.println(String.format("%s, votre nombre de %d tentatives est épuisé, c'est la fin", userName, nombreTentatives));
            break;
        }
        }
        saisie.close();
    }
    
    
    public static void main(String[] args) {
        jeu();
        Scanner saisieContinuer = new Scanner(System.in);
        System.out.println("Voulez-vous continuer (true ou false)?");
        while(true){
        String continuer = saisieContinuer.nextLine();
        if(continuer.equals("true")){
            continue;
        }
        else if(continuer.equals("false")){
            break;
        }
        
    }
       
    }

}

