import java.util.*;
import java.util.ArrayList.*;
//Loic
  
class Point 
{
    protected Integer x, y;

    public Point (int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void affiche()
    {
        System.out.println(String.format("Le point est aux coordonnées {%d, %d}",this.x, this.y));
    }

    public void move(int dx, int dy)
    {
        this.x += dx;
        this.y += dy;
    }
}

class Cercle extends Point
{
    Integer rayon;

    public Cercle (int x, int y, int r)
    {
        super(x, y);
        this.rayon = r;
    }

    public void affiche()
    {
        System.out.println(String.format("Le cercle est au point de coordonnées {%d, %d} pour un rayon== de %d", this.x, this.y, this.rayon));
    }

    public Double surface()
    {
        return this.rayon*this.rayon*3.14159;
    }
}

class Carre extends Point
{
    Integer longueur;

    public Carre (int x, int y, int l1)
    {
        super(x, y);
        this.longueur =l1 ;
    }

    public void affiche()
    {
        System.out.println(String.format("Le carré est au point de coordonnées {%d, %d} pour une longueur de %d", this.x, this.y, this.longueur));
    }
}

class Rectangle extends Carre
{
    Integer largueur;

    public Rectangle (int x, int y, int l1, int l2)
    {
        super(x, y, l1);
        this.largueur = l2;
    }

    public void affiche()
    {
        System.out.println(String.format("Le rectangle est au point de coordonnées {%d, %d} pour une longueur de %d et sa largueur est de %d", this.x, this.y, this.longueur, this.largueur));
    }

    public Integer surface()
    {
        return this.longueur*largueur;
    }

   
}
class POOFigureOne {
   
    public static void main(String[] args) 
    {

        Point p1= new Point (5,6);
        p1.affiche();
        Cercle c1= new Cercle (5,6, 45);
        c1.affiche();
        c1.move(7, 8);
        c1.affiche();
        System.out.println(String.format("Surface cercle %f", c1.surface()));
        
        Carre k1 = new Carre( 18, -3, 15 );
        k1.affiche();
        // Carre : (5, 6) cote=15
        Rectangle r1 = new Rectangle( 3, 19, 99, 18 );
        r1.affiche();

        r1.move(3,4);
        r1.affiche();
        // Rectangle : (5, 6) long=99 lar=18
        System.out.println(String.format("Surface rectangle %d", r1.surface()));
       
    }
}