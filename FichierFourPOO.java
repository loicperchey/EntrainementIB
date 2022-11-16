import java.util.*;
import java.util.ArrayList.*;



import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/* 
    Fichier texte (caractère + les controles)
        lire jusqua la fin quand on rencontre le caractere EOF

    Fichier binaire 
        connaitre la taille du fichier et puis le lire jusqu'à la fin 

*/

/* 
class MyException extends Exception
{

    public MyException()
    {
        super();
    }

}
*/

class MyFileReader  extends FileReader
{

    static Integer EOF = -1;
    static Integer LF = 10;
    static int CR = 13;
    int caractereLuEnTrop; 

    public MyFileReader(String fileName ) throws FileNotFoundException
    {
        super( fileName );
    }

    public Boolean hasNext() throws IOException
    {

        if ( EOF == ( this.caractereLuEnTrop=this.read()) )
            return false;
        return true;
    }

    public String readLine() throws Exception
    {
        int caracter;

        String res = new String();
        res += (char)this.caractereLuEnTrop;

        while ( EOF != (caracter = this.read()) )
        {
            if ( caracter == LF )
                return res;
            else
                res += (char)caracter; 
        }
        throw new Exception();
    } 
}

public class  FichierFourPOO {
    // Loic

    public static void main(String[] args) throws Exception
    {    
    
       
        String file = "Figures.java";
        //String file = args[0];
        MyFileReader filereader = new MyFileReader(file);
              
        try {
            HashMap<String, Integer> occurrence = new HashMap<>();

                int nbrLin = 1;
                String ligne;
                String[] words = null;    
                int count = 0;   
                while ( true)
                {
                    ligne = filereader.readLine();

                    words = ligne.split(" ");
                    count = count + words.length;   
                    
                for (String word : words){ 
                    if( !word.equals("") && word.length()>0 && !word.equals("\n")){
                    System.out.print( String.format("nombre de mots dans le fichier : %s, avec leur numéro : %s", count, word ) );
                    System.out.println( String.format("Ligne numéro %4d", nbrLin++ ) );
                    System.out.println( String.format("La liste des lignes avec leurs mots : %ss", ligne ) );
                    
                if( ! occurrence.containsKey(word))
                    occurrence.put(word, 1);
                    else
                    occurrence.put(word, occurrence.get(word)+1);
                    }
                }
            }
                
                
                
        }

        catch(IOException e) 
        {
            System.out.println( "une erreur s'est produite" );
            //e.printStackTrace();
        }
        
        catch (Exception e) 
        {
            System.out.println( "fin du fichier" );
        }

        finally 
        {
            System.out.println( "finally" );
            filereader.close();
        }
    }    
}