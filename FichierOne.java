import java.io.FileReader;
import java.io.IOException;

public class FichierOne 
{
    public static void main(String[]args) throws IOException
    {
        int EOF=-1;
        int LF = 10;
        int CR = 13;
        String file = "LeBonCoin.java";
        try{
            FileReader filereader = new FileReader(file);
            /* 
            for (int i=0; i<100; i++){

            System.out.println((char)filereader.read());
            }
            */
            int c;
            int nbrCar =0;
            int nbrLin =0;
            while (EOF != (c = filereader.read()))
            {
                if (c == LF){
                    nbrLin++;
                    System.out.println(String.format("%4d", nbrLin));
                }else{
                System.out.println( (char)c);
                }
                nbrCar++;
            }
            
            filereader.close();
            System.out.println(nbrCar);
            System.out.println(nbrLin);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
