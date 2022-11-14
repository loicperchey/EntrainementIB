package LBC;
import java.util.Scanner; 
public class Annonce {

    
String title;
Double price;
String description;


    public Annonce()
    {}

    public Annonce(String title, Double price, String description)
    {
        this.title = title;
        this.price = price;
        this.description = description;
    }

    public String toString(){
        return String.format("%s\nAnnonce\nde : %s\n %s\n", this.title, this.price, this.description);
    }

    public void saisie(Scanner sc)
    {   
        System.out.print("Quel titre ? : ");
        this.title = sc.nextLine();
        System.out.print("A quel prix ? : ");
        this.price = sc.nextDouble();
        System.out.print("Sa description : ");
        this.description = sc.nextLine();

    }
}
