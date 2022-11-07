public class Surface 
{
//LOIC    
public static double surfaceRect( int lar, int longueur )
{
    double surfaceRectangle = lar*longueur;
    return surfaceRectangle;
}

public static double surfaceCarre(int cote)
{
    double surfaceCarre = cote*cote;
    return surfaceCarre;
}

public static double surfaceCercle(double rayon)
{   double surfaceCercle = Math.PI*(rayon*rayon);
    return surfaceCercle;
}

public static void main( String[] args )
{
    //System.out.println( args[0]  );
    System.out.println( "La surface du rectangle est de :" + surfaceRect ( 5, 8 ) + "m²" );
    System.out.println( "La surface du carré est de :" + surfaceCarre ( 7 ) + "m2");
    System.out.println( "La surface du cercle est de : " + surfaceCercle( 7.5 ) + "m²" );
}    
}