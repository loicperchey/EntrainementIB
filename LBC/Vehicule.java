package LBC;
import java.util.Scanner; 

public class Vehicule extends Annonce{
    String modèle;
    Double kilometrage;

    public Vehicule()
    {}

    public String toString(){
        return String.format("Modèle : %s\n kilométrage : %f", this.title, this.price, this.description);
    }

    public void saisie(Scanner sc)
    { 
        super.saisie(sc);
        System.out.print("Modèle ? : ");
        this.modèle = sc.nextLine();
        System.out.print("Kilométrage : ");
        this.kilometrage = sc.nextDouble();
     
        
    }
}
