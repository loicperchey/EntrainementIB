public class LoopAlgoTriangle
//Loic
{

    public static void dessineTriangle(int hauteur){
    
}
    
    public static void main(String[] args)
    {
        int hauteur = 10;
        int count = 0;
        
        for( int numLigne= 0; numLigne <= hauteur; numLigne++){
            for(int numEtoile = 0; numEtoile < numLigne; numEtoile++){
                System.out.print("*");
                count++;
            }
            System.out.println("");
        }
        System.out.println("Le nombre d'étoiles est : " + count);
       
}

}
