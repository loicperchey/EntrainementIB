import java.io.FileReader;
import java.io.IOException;

public class FichierOne 
{
    public static void main(String[]args) throws IOException
    {
        String file = "FiguresSablier.java";
        try{
            FileReader filereader = new FileReader(file);
            /* 
            for (int i=0; i<100; i++){

            System.out.println((char)filereader.read());
            }
            */
            int c;
            int fr_count =0;
            while (-1 != (c = filereader.read()))
            {
                System.out.println( (char)c);
                fr_count++;
            }
            filereader.close();
            System.out.println(fr_count);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
