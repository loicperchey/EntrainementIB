package LBC;
import java.util.Scanner; 
public class Annonce {

    
String title;
Double price;
String description;
Scanner saisie = new Scanner(System.in);


    public Annonce()
    {}

    public Annonce(String title, Double price, String description)
    {
        this.title = title;
        this.price = price;
        this.description = description;
    }

    public String toString(){
        return "Je suis une Annonce";
    }

    public void saisie(Scanner scanner)
    {   
      
        this.title = saisie.nextLine();
        System.out.print("A quel prix ? : ");
        this.price = saisie.nextDouble();
        System.out.print("Sa description : ");
        this.description = saisie.nextLine();

    }
}
