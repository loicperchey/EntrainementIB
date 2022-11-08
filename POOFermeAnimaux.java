import java.util.*;
import java.util.ArrayList.*;
//Loic
  
abstract class Animal 
{
    protected String repas="";
    protected String nom;
    protected Double taille  = 0.0;
    protected Double poids   = 0.0;
    protected String donne="";

    public Animal (String nom, String repas, Double taille, Double poids, String donne)
    {
        this.nom = nom;
        this.repas  = repas;
        this.taille = taille;
        this.poids = poids;
        this.donne = donne;
    }

    public void getNom(){
        
    }

    public void getRepas(){
        
    }

    public void getTaille(){
        
    }
    public void getPoids(){
        
    }

    public void getDonne(){
        
    }
    public String setNom(String nom){
        return nom;
    }

    public String setRepas(String repas){
        return repas;
    }

    public Double setTaille(Double taille){
        return taille;
    }

    public Double setPoids(Double poids){
        return poids;
    }

    public String setDonne(String donne){
        return donne;
    }
}
   class Mammifere extends Animal{

    public Mammifere (String nom, String repas, Double taille, Double poids, String donne)
            {
                super(nom, repas, taille, poids, donne);
            }
        }

    class Oiseaux extends Animal{

            public Oiseaux (String nom, String repas, Double taille, Double poids, String donne)
                    {
                        super(nom, repas, taille, poids, donne);
                    }
                }

    class Vache extends Mammifere{

                    public Vache (String nom, String repas, Double taille, Double poids, String donne)
                            {
                                super(nom, repas, taille, poids, donne);
                            }

                    public void Expression(){
                            System.out.println(String.format(" Je suis une %s, je mange principalement des %s, je mesure %f cm pour un poids de %f kg et je donne du %s",this.nom,this.repas,this.taille,this.poids, this.donne));
                            }
                }
    class Poule extends Oiseaux{

                    public Poule (String nom, String repas, Double taille, Double poids, String donne)
                            {
                                super(nom, repas, taille, poids, donne);
                            }
                    public void Expression(){
                            System.out.println(String.format(" Je suis une %s, je mange principalement des %s, je mesure %f cm pour un poids de %f kg et je donne des %s",  this.nom, this.repas,  this.taille,  this.poids, this.donne));
                            }
                }
                

class POOFermeAnimaux {
   
    public static void main(String[]args) 
    {
        Vache v1 = new Vache("Vache", "herbe", 1.40, 300.02, "lait");

        Poule p1 = new Poule("Vache", "herbe", 1.40, 300.02, "lait");

        v1.Expression();
        p1.Expression();
       
    }
}