package LCP;

import habitat.Locus;
import habitat.Alpage;
import habitat.Marin;
import habitat.Atlantide;
import habitat.Plaine;
import insecte.Papillon;
import insecte.Moustique;
import insecte.Insecte;
import insecte.Cigale;

public class LCP {
    
    public static void main(String[]args){

        Alpage m1 = new Alpage("Blanche");
        Plaine l1 = new Plaine("Provence");

        Papillon p1 = new Papillon("bombyx");
        Insecte c1 = new Cigale("midi");

        System.out.println(p1.liveIn(m1));
        System.out.println(c1.liveIn(l1));
        System.out.println(m1.has(c1));
        System.out.println(l1.has(p1));
    }
}
