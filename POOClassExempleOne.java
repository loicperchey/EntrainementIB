import java.util.*;
import java.util.ArrayList.*;

// variables globales 
//static String fileConfName = "biblio.cnf";
//static int version = 3;


class Bibliotheque
{
    // variable 
    private ArrayList<Livre> rayon = new ArrayList<>();

    // constructor
    public Bibliotheque()
    {
    }

    public void ajouter( Livre l )
    {
        this.rayon.add( l );
    }

    public void lister()
    {
        for( int i=0 ; i < this.rayon.size() ; i++ )
        {
            Livre livre = this.rayon.get( i );
            System.out.println( livre );
        }

        for (Livre livre : this.rayon) {
            System.out.println( livre );
        }
    }
}



class Livre {
    // variables d'instance
    private String titre = "";
    private String auteur = "";

    // variables de classe
    static int nbrLivre;

    // contructeur(s)
    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        nbrLivre++;
    }

    // les méthodes 
    public String toString() {
        return String.format("%s de %s", titre.toUpperCase(), auteur);
    }


    // les getters et setter
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public static int getNbrLivre() {
        return nbrLivre;
    }

    public static void setNbrLivre(int nbrLivre) {
        Livre.nbrLivre = nbrLivre;
    }
}

class POOClassExempleOne {
    // Xavier

    public static void main(String[] args) {

        Livre livre1 = new Livre("tintin au club Med", "Hergé");

        System.out.println(livre1);

        livre1.setAuteur("Kant");

        System.out.println(livre1);
        // TINTIN AU CLUB MED de Hergé


        Bibliotheque maBiblio = new Bibliotheque(); 

        maBiblio.ajouter( livre1 );
        maBiblio.ajouter( new Livre("Martine sort en boite", "Ségolène") );

        maBiblio.lister();

    }
}