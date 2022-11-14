package LBC;
import java.util.Scanner; 

public class Location extends Annonce {

    Integer surface;
    Integer nbrPiece;
    
    public Location(){
        
    }

    public String toString(){
        return "Je suis une Annonce";
    }

    public void saisieLocation()
    {
        System.out.print("Quel est la surface ? : ");
        this.surface = saisie.nextInt();
        System.out.print("Nombre de pièces : ");
        this.nbrPiece = saisie.nextInt();
     
   
       
    }
}
