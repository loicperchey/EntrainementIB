import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class MyFileReader extends FileReader
{
    static Integer EOF = -1;
    static Integer LF = 10;
    int CR=13;
    int caractereLuEnTrop;

    public MyFileReader(String fileName) throws IOException
    {
        super(fileName);
    }

    public Boolean hasNext() throws IOException
    {

        int car; 

        if(EOF == (this.caractereLuEnTrop=this.read()))
            return false;
        return true;

    }

    public  String readLine() throws Exception
    {
        
        int caracter;
        
        String res= new String();
        res += (char) this.caractereLuEnTrop;
        
        while (EOF != (caracter = this.read()))
        {
            if (caracter == LF)
            {
                return res;
            }
            else
            {
                res+=(char)caracter;
            }
        }
    throw new EOFException();

    }
}


public class FichierThreePOO 
{
    public static void main(String[]args) throws IOException
    {
        
        String file = "LeBonCoin.java";
        MyFileReader filereader = new MyFileReader(file);
        try{
            /* 
            for (int i=0; i<100; i++){

            System.out.println((char)filereader.read());
            }
            */
           
            int nbrLin =1;
            String line;

            while (true)
            {
                line = filereader.readLine();
                System.out.println(String.format("%4d : %s", nbrLin++, line));
            }
        }
            
        catch(EOFException e)
        {
            System.out.println("Fin du fichier");
        }
        
        catch (Exception e){
            e.printStackTrace();
        }

        finally
        {
            System.out.println("finally");
            filereader.close();
        }
    }
}
