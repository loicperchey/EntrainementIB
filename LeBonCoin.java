import LBC.Annonce;
import LBC.Location;
import LBC.Vehicule;
import java.util.Scanner; 


public class LeBonCoin {

    public static void main(String[]args)
    {
        Scanner sc = new Scanner( System.in );
       
        Vehicule v = new Vehicule();
        v.saisie(sc);
        System.out.println(v);
     
        sc.close();

    }
}

