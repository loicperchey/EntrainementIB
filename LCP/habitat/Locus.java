package LCP.habitat;

import insecte.Insecte;

public class Locus {
    private String nom;

    public Locus(String nom)
    {
        this.nom = nom;
    }
    public String toString()
    {
        return String.format("lieu : %", this.nom);
    }

    public Boolean has(Insecte i)
    {
        String monClassLocus = i.getClass().getName();
        String monClassInsecte = this.getClass().getName();

   
        if (monClassInsecte.equals("Moustique") && monClassLocus.equals("Alpage"))
        return false;

        if (monClassInsecte.equals("Cigale") && monClassLocus.equals("Provence"))
        return true;
        return null;

    }
    
}
