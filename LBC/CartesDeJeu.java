package LBC;
import java.util.Scanner; 

public class CartesDeJeu extends Annonce {

    String jeu;
    Integer nbreCartes;
    
    
    public CartesDeJeu(){
        
    }

    public String toString(){
        return String.format("Jeu de carte : %s, nombre de cartes : %d ", this.jeu, this.nbreCartes);
    }

    public void saisie(Scanner sc)
    {
        super.saisie(sc);
        System.out.print("Quel jeu de cartes ? : ");
        this.jeu = sc.nextLine();
        System.out.print("Nombre de cartes : ");
        this.nbreCartes = sc.nextInt();
        
        
     
   
       
    }
}
