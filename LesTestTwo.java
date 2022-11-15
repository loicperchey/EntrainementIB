


// Loic

class Atester 
{
    static public Integer calcul1( int var )
    {
        return 5 * var;
    }

    static public String presentation( String n )
    {
        if ( n == null )
            return null;
            
        if ( n.length() == 0 )
            return n;
            
        return n.substring(0, 1 ).toUpperCase() +  n.substring( 1 ).toLowerCase();

    }

    static public void testString( String a,  String b )
    {
        if ( a != null && b != null  )
            System.out.println( String.format( "%s : %s == %s   ", a.equals(b) ? "OK" : "KO",  a, b   ));
        else if ( a == null && b != null  )
            System.out.println( String.format( "KO : null == %s   ", b   ));
        else if ( b == null && a != null  )
            System.out.println( String.format( "KO : %s == null   ", a   ));
        else
            System.out.println( "OK : null == null");
    }

    static public void testBisextile( int an, Boolean r  )
    {
        System.out.print( an );
        Atester.testBoolean( isBisextile(an )  , r);
 
    }

    static public void testBoolean( Boolean a,  Boolean b )
    {
        if ( a!= null && b != null )
            System.out.println( String.format( "%s : %b == %b   ", a == b ? "OK" : "KO",  a, b   ));
        else if ( a == null && b != null  )
            System.out.println( String.format( "KO : null == %b   ", b   ));
        else if ( b == null && a != null  )
            System.out.println( String.format( "KO : %b == null   ", a   ));
        else
            System.out.println( "OK : null == null");
    }

    static public void testDoubleEq( Double a,  Double b )
    {
        if ( a!= null && b != null )
            System.out.println( String.format( "%s : %f == %f   ", a.equals(b)? "OK" : "KO",  a, b   ));
        else if ( a == null && b != null  )
            System.out.println( String.format( "KO : null == %f   ", b   ));
        else if ( b == null && a != null  )
            System.out.println( String.format( "KO : %f == null   ", a   ));
        else
            System.out.println( "OK : null == null");
    }

    static public boolean isBisextile(int annee) {
        if (annee % 400 == 0) {
            return true;
        } else if (annee % 100 == 0) {
            return false;
        } else if (annee % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    static public Double tarif(int age) 
    {
        if ( age <  5 )
            return 0.0;
        else if ( age <  12 )
            return 4.0;
        else if ( age <60 )
            return 5.5;
        else 
            return 4.5;
    }

    static public boolean isBisextileJ(int annee) {
        return ((annee % 4 == 0) && (annee % 100 != 0)) || (annee % 400 == 0);
    }

} 


class MesTest extends TestCase
{
    static public void testPiscine()
    {
        if ( Atester.calcul1( 3 ) == 15 )
            System.out.println( "OK" );

        if ( Atester.calcul1( 0 ) == 0 )
            System.out.println( "OK" );


        /* ******************************* */

        String n = null;
        Atester.testString( Atester.presentation( "toto" )  , "Toto" );
        Atester.testString( Atester.presentation( "TOTO" )  , "Toto" );
        Atester.testString( Atester.presentation( "t" )     , "T" );
        Atester.testString( Atester.presentation( n )    , null );
        Atester.testString( Atester.presentation( "" )  , "" );

        Atester.testBisextile( 1900   , false );
        Atester.testBisextile( 2068   , true );
        Atester.testBisextile( 2488   , true );                                                                    
        Atester.testBisextile( 2600   , false );
        Atester.testBisextile( 1983   , false );
        Atester.testBisextile( 1982   , false );
        Atester.testBisextile( 1981   , false );
        Atester.testBisextile( 2020   , true );

        /* 
        for ( int an = 1000 ; an < 2000 ; an +=3 )
        {
            Boolean res =  ((an % 8 == 0) && (an % 100 != 0)) || (an % 400 == 0);
            Atester.testBisextile( an   , res );
        }            
        */


        /* 
        * inf      à 12 a -> 4€
        * inf      à 60 a -> 5.5€
        * sup ega  à 60 a -> 4.5€
        */

        Atester.testDoubleEq( Atester.tarif( 11 ) , 4.0 );
        Atester.testDoubleEq( Atester.tarif( 12 ) , 5.5 );
        Atester.testDoubleEq( Atester.tarif( 59 ) , 5.5 );
        Atester.testDoubleEq( Atester.tarif( 60 ) , 4.5 );
        Atester.testDoubleEq( Atester.tarif( 61 ) , 4.5 );
        Atester.testDoubleEq( Atester.tarif( 4 ) , 0.0 );
        Atester.testDoubleEq( Atester.tarif( 5 ) , 4.0 );
        Atester.testDoubleEq( Atester.tarif( 6 ) , 4.0 );
    }
}    


public class LesTestTwo 
{
    public static void main( String[] args )
    {
        MesTest.testPiscine();
    }
}