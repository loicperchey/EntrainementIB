import java.util.*;
import java.util.ArrayList.*;
//Loic
  
class Ligne 
{

   

    protected String libel  = "";
    protected Double pu   = 0.0;
    protected Double quantite  = 0.0;
    protected Double prixTot =  0.0;
    
    


    static Integer nbrLigne=0;

    static int noOfObjets =0;
    {
        noOfObjets +=  1;
    }

    public Ligne (String nom, double pu, Double qte)
    {
        this.libel  = nom;
        this.pu =   pu;
        this.quantite    =   qte;
        this.prixTot = this.quantite*this.pu;
        nbrLigne++;
    }

    public void affLigne(){
        System.out.println(String.format("%15s %8.2f %8.2f = %8.2f", this.libel, this.pu, this.quantite, this.prixTot));
    }

    public Double getQuantite()
    {
        return this.quantite;
    }

    public void setQuantite(Double qte)
    {
        this.quantite=qte;
        this.prixTot = this.quantite*this.pu;
    }

    
}


class Ticket 
{
    String client  = "";
    Double prixTot =  0.0;
    Double prixTotal = 0.0;

   
    ArrayList<Ligne> lignes = new ArrayList<Ligne>();

    static int noOfObjets =0;
    {
        noOfObjets +=  1;
    }


    public Ticket(String ticket){
        this.client = ticket;
    }

    public void addAchat(Ligne l)
    {
        this.lignes.add(l);
        this.prixTotal += l.prixTot;
    }

    public void affTicket()
        {
        System.out.println("=============================");
        System.out.println(String.format("client : %15s", this.client));
        for(Ligne l : lignes){
            l.affLigne();
        }
        System.out.println(lignes.size());
        System.out.print(this.prixTotal);
        System.out.println("=============================");
    }


 
}


class TiroirCaissePOOOne {

    static ArrayList<Ligne> lignes = new ArrayList<Ligne>();
    

   
    public static void main(String[] args) {

        Ticket t1 = new Ticket("Curé de Camaret");
        t1.addAchat(new Ligne("romarin", 7.56, 1.0));
        t1.addAchat(new Ligne("rutabaga", 1.5, 5.0));
        t1.addAchat(new Ligne("choux de Bruxelles", 4.50, 1.0));
        t1.addAchat(new Ligne("réglisse", 8.75, 0.5));
        t1.addAchat(new Ligne("bettes", 2.4, 1.0));
        t1.affTicket();
        

        Ticket t2 = new Ticket("Robin des bois");
        t2.addAchat(new Ligne("romarin", 7.56, 1.0));
        t2.addAchat(new Ligne("rutabaga", 1.5, 5.0));
        t2.addAchat(new Ligne("choux de Bruxelles", 4.50, 1.0));
        t2.addAchat(new Ligne("réglisse", 8.75, 0.5));
        t2.addAchat(new Ligne("bettes", 2.4, 1.0));
        t2.affTicket();
       

        System.out.println(String.format("nombre de lignes : %d", Ligne.nbrLigne));
        System.out.println(String.format("Le nombre d'objets est de : %f",Ticket.noOfObjets+Ligne.noOfObjets));

    }
}