import java.util.Scanner;

public class ChaineFormat {

    public static String gestionFormat(){

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Quel produit ?");
        String article = scanner.nextLine();
        System.out.println("Quelle quantité ?");
        Integer qte = scanner.nextInt();
        System.out.println("Quel prix unitaire ?");
        double PU = scanner.nextDouble();*/
        
        String article = "patate";
        Integer qte = 2;
        double PU = 1.56;

        String conversion2 = String.format("%s", article);
        String conversion1 = String.format("%d", qte);
        String conversion3 = String.format("%f", PU);
        String frites = String.format(conversion1 + conversion2 + conversion3 + qte*PU);
        return frites;
    }
    
    public static void main( String[] args )
    {
        System.out.println(gestionFormat());
        // | libel      | qtÃ©   | PU         |  PT
// | tomate     | 2     | 3.99       |  7.98
// |    tomate  |    2  |     3.99   |  7.98
// |    tomate  |    2.-|       3.99 |  7.98
    }    
}


