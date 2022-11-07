import java.util.ArrayList;

class  OperatorOne {
    // Loic
    public static void main(String[] args) {
  
        /*
        *   == strictement égal
        *   != différent
        *   == strictement égal
        *   / div
        *   || or ou
        * 
        */
        


        /*
        * Operateurs binaires
        * En ordre croissant de priorité
        * 
        *   + add (commutatif)
        *   - sub
        *   * mul (commutatif)
        *   / div
        *   % mod modulo : donne le reste d'une division entière
        * 
        * 
        *  & and
        *  | or
        *  ^ xor
        *  
        * >> : décalage des bits à droite (division)
        * >>> : décalage des bits sur la droite sans impacter le signe
        * << : décalage des bits à gauche (multiplication)
        * operateur unaire
        * !
        * - complement à 1 : permet de faire les nombres négatifs
        * operateur ternaire
        * bool ? A : B //presque équivalent à A et B
        * 
        * 
        * 
        */

        int result = 10 % 3 ;
        System.out.print(result);

        for(int i=0; i<20; i++){
            System.out.println(String.format("%d %c 5 = %d",  i, '%', i%5));
        }

        String noms[] = {"toto", "titi", "tata", "tutu"};

    for(int i=1; i<25; i++){
        System.out.println("Je donne un bonbon à : " + noms[i%4]);
    }

    int v1 = 12;
    int v2 = 10;
    
    System.out.println(String.format(" %s & %s", Integer.toBinaryString(v1), Integer.toBinaryString(v2)));
    System.out.println(String.format(" %s | %s", Integer.toBinaryString(v1), Integer.toBinaryString(v2)));
    System.out.println(String.format(" %s ^ %s", Integer.toBinaryString(v1), Integer.toBinaryString(v2)));
}
}


