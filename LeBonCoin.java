import LBC.Location;
import LBC.Annonce;
import LBC.Vehicule;
import LBC.Job;
import java.util.Scanner; 


public class LeBonCoin {

    public static void main(String[]args)
    {
        
        Scanner sc = new Scanner( System.in );
        System.out.print( "type annonce : " );
        String typeAnnonce = sc.nextLine();

        Annonce a = new Annonce(); 

        if ( typeAnnonce.equals( "Location" ) )
            a = new Location();
        else if ( typeAnnonce.equals( "voit" ) )
            a = new Vehicule();
        else if ( typeAnnonce.equals( "job" ) )
            a = new Job();

        a.saisie( sc );
        System.out.println( a );
        
        sc.close();

    }
}

