import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class MyFileReader extends FileReader
{
    public MyFileReader(String fileName) throws IOException
    {
        super(fileName);
    }

    public  String readLine() throws IOException
    {
        int EOF=-1;
        int LF = 10;
        int CR = 13;
        int caracter;

        String res="";
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
    return "x*X";

    }




}


public class FichierTwoPOO 
{
    public static void main(String[]args) throws IOException
    {
        
        String file = "LeBonCoin.java";
        try{
            
            MyFileReader filereader = new MyFileReader(file);
            /* 
            for (int i=0; i<100; i++){

            System.out.println((char)filereader.read());
            }
            */
           
            int nbrLin =1;
            String line;

            while (true){
            line = filereader.readLine();
                System.out.println(String.format("%4d : %s", nbrLin++, line));
            }
               
            
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
