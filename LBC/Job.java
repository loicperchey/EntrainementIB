package LBC;
import java.util.Scanner; 
public class Job extends Annonce{

    
String intitulé;
String description;


    public Job()
    {}

    public Job(String intitulé, String description)
    {
        this.intitulé = intitulé;
        this.description = description;
    }

    public String toString(){
        return String.format("%s\nAnnonce\nde : %s\n", this.intitulé, this.description);
    }

    public void saisie(Scanner sc)
    {   
        super.saisie(sc);
        System.out.print("Quel titre ? : ");
        this.intitulé = sc.nextLine();
        System.out.print("Sa description : ");
        this.description = sc.nextLine();

    }
}
