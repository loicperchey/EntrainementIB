class Line2 {
    
    public static void line(int longueur)
    {
        for(int i=0; i<longueur; i++)
        {
            System.out.print("X");
        }
        System.out.println("");
    }

    public static void lineVide(int longueur)
    {
        System.out.println("|");
        for(int i=0; i<longueur; i++)
        {
            System.out.print(" ");
        }
        System.out.println("|");
    }

    public static void rectangle(int longueur, int largeur)
    {
        line(longueur);
         for(int i=0; i<largeur; i = i+longueur){
            lineVide(longueur);
        line(longueur);
        }
    }
    public static void main(String[] args) {

        rectangle(5, 9);
        rectangle(50, 3);
    }
}
