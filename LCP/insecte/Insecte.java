package LCP.insecte;

import javax.script.ScriptException;
import habitat.Locus;

public class Insecte
 {
    private String nom;

    public Insecte(String nom)
    {
        this.nom   =    nom;
    }
    public String toString()
    {
        return String.format("Je suis %s (%s)", this.nom, this.getClass().getName() );
    }

    public Boolean liveIn (Locus l)
    {
        String monClassLocus = l.getClass().getName();
        String monClassInsecte = this.getClass().getName();

        if (monClassInsecte.equals("insecte.Moustique") && monClassLocus.equals("Alpage"))
        return false;

        if (monClassInsecte.equals("Cigale") && monClassLocus.equals("Provence"))
        return true;
        
        return null;

    }
}
