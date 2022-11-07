public class Fonctions {
    //Loic
    public static int somme(int p1, int p2)
    {
        return p1 + p2;
    }

    public static String surfaceRectangle(int largeur, int longueur)
    {
        return "surface rectangle("+longueur+","+largeur+" ) =" + (largeur*longueur) + "m²";
    }


    public static void main(String[]args)
    {
        //System.out.print( args[0] );

        int resultat = somme(5, 6);
        System.out.println(resultat);
        System.out.println(surfaceRectangle(5, 8));
        System.out.println(surfaceRectangle(7, 9));
    }

}
