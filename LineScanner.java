import java.util.Scanner;

public class LineScanner{
    Scanner scanner = new Scanner(System.in);


    public static void lineSpeciale( int longueur, String extremit, String remplissage )
    {
        System.out.print( extremit );
        for( int j = 0 ; j <longueur-2 ; j = j + 1 ) 
            System.out.print( remplissage );
        System.out.println( extremit );
    }

    public static void lineOfX( int longueur )
    {
        lineSpeciale(  longueur, "+", "-");
    }

    public static void rectangle( int largeur, int hauteur)
    {
        lineOfX( largeur );
        for ( int i=0 ; i < hauteur ; i = i + 1)
            lineSpeciale( largeur, "|", " " );
        lineOfX( largeur );
    }


    
    

    public static void main(String[] args) {
    int nombreRectangles =0;
    System.out.println("Combien de rectangles ?");
    Scanner scannerNombreRectanglesDemande = new Scanner(System.in);
    int nombreRectangle = scannerNombreRectanglesDemande.nextInt();
    Scanner largeurRectangle = new Scanner(System.in);
    Scanner hauteurRectangle = new Scanner(System.in);
    
        
        do{
            System.out.println("Quelle largeur de votre rectangle ?");
            System.out.println("Quelle hauteur de votre rectangle ?");
            rectangle(largeurRectangle.nextInt(), hauteurRectangle.nextInt());
            largeurRectangle.close();
            hauteurRectangle.close();
           nombreRectangles++;

        }while(nombreRectangles<nombreRectangle);
        scannerNombreRectanglesDemande.close();
        
    
    }
}