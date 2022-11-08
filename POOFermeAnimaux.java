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
                
    class LaFerme 
                {
                    String nomFerme  = "";
                    String composeDe = "";
                
                    public LaFerme (String nomFerme, String composeDe){
                        this.nomFerme=nomFerme;
                        this.composeDe = composeDe;
                    }

                    public void ExpressionFerme(){
                        System.out.println(String.format(" Je suis une ferme nommée %s composée de %s",  this.nomFerme, this.composeDe));
                        }
                 
                }

                class Champs extends LaFerme{
                    Vache v1, v2;
                    public Champs(){
                    super("champs", "vache");
                    this.v1 = new Vache("Milka", "herbes", 1.40, 300.02, "lait");
                    this.v2 = new Vache("whooper", "herbes", 1.40, 300.02, "viande");
                    }
                    public void DansLaFerme(){
                    ExpressionFerme();
                    v1.Expression();
                    v2.Expression();
                    }
                }
                class Poulailler extends LaFerme{
                    Poule p1, p2;
                    public Poulailler(){
                    super("Poulailler", "poules");
                    this.p1 = new Poule("Doux", "graines", 40.04, 4.00, "viande");
                    this.p2 = new Poule("Cassegrain", "graines", 40.04, 4.00, "oeufs");
                    }
                    public void DansLaFerme(){
                    ExpressionFerme();
                    p1.Expression();
                    p2.Expression();
                    }
                }


class POOFermeAnimaux {
   
    public static void main(String[]args) 
    {
        Poulailler pp1 = new Poulailler();
        pp1.DansLaFerme();
        Champs cc1 = new Champs();
        cc1.DansLaFerme();
       
    }
}