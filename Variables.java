//
public class Variables 
{
    public static void main(String[]args)
    {
        int temperature = 19; //32 bits 0-4G 
        //  LVALUE      RVALUE
        int temperatureSigned = 19; //32 bits -2G à + 2G 

        int largeur = 45;

        double longueur = 56.5;

        double surface = largeur * longueur;

        double temperaturePrecise = 19.5; //32 bits 0-4G 
        double poidsDeTata = 56.4;        //64 bits 

        char uneLettre = 'A'; //caractère stocké sur 2 byte (soit 16 bits)
        String maChaine = "Toto va à la pêche";//Chaine de caractères manipulée

        System.out.println("La température est de :" + temperature);
        System.out.println("La température est exactement:" + temperaturePrecise );
        System.out.println("Le poids de Tata est de:" + poidsDeTata );
        System.out.println(uneLettre);
        System.out.println(maChaine);
        System.out.println("La surface est de : " + surface);
        System.out.println("La surface est de : " + ( largeur*longueur ) );
        System.out.println("La surface est de : " + largeur+" - " + longueur );
    }
}
