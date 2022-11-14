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

    public void saisie(Scanner sc)
    {
        super.saisie(sc);
        System.out.print("Quel est la surface ? : ");
        this.surface = sc.nextInt();
        System.out.print("Nombre de pièces : ");
        this.nbrPiece = sc.nextInt();
     
   
       
    }
}
