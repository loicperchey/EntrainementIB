public class LoopAlgo 
{
    public static void main(String[] args)
    {
        for (int i=0; i< 5; i++)
        {
            for(int j=0; j< 15; j++){
                System.out.print("O");
            }
            System.out.println(" : " + i);
        }

        for (int i=0; i< 5; i++)
        {
            for(int j=0; j< 15; j++){
                String res = String.format("%dX%d =%3d", i, j, i+j  );
                System.out.print(   res );
                System.out.print(   res );
                //System.out.print( j + "X" + i + "=" + i*j + " " );
            }
            System.out.println("");
        }
}
}
