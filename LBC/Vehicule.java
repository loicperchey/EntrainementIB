package LBC;
import java.util.Scanner; 

public class Vehicule extends Annonce{
    String modèle;
    Double kilometrage;

    public Vehicule()
    {}

    public String toString(){
        return "Je suis une Annonce";
    }

    public void saisie(Scanner sc)
    { 
        super.saisie(sc);
        System.out.print("Modèle ? : ");
        this.modèle = saisie.nextLine();
        System.out.print("Kilométrage : ");
        this.kilometrage = saisie.nextDouble();
     
        
    }
}
