import java.util.Scanner;

class Atester
   {
        public static Integer calcul1(int var)
        {
            return 5*var;
        }

        public static String presentation(String mot)
        {
            mot = "";
            if(mot.isEmpty())
            {
                return mot = "";
            }
            else{
         mot = mot.substring(0, 1).toUpperCase() + mot.substring(1).toLowerCase();
            return mot;
            }
            
        }

        
}

class LesTestsOne {
    public static void main(String[] args) 
    {
        if (Atester.calcul1(3) == 15)
        {
            System.out.println ("Calcul 3 = OK");
        }

        if (Atester.calcul1(0) == 0){
            System.out.println ("Calcul 0 = OK");
        }
           
        if (Atester.calcul1(1) == 5){
            System.out.println ("Calcul 1 = OK");
        }

        if (Atester.presentation("toto").equals("Toto"))
        System.out.println ("toto = OK");
        else
        System.out.println ("toto = KO");

        if (Atester.presentation("TOTO").equals("Toto"))
        System.out.println ("TOTO = OK");
        else
        System.out.println ("TOTO = KO");

        if (Atester.presentation("").equals(""))
        System.out.println ("rien n'est renvoyé, c'est OK (façon Jacqouille)");
        else
        System.out.println ("C'est pas KO, Jacqouille se fait tabasser");

        if (Atester.presentation("1234567890").equals("1234567890"))
        System.out.println ("1234567890 = C'est OK");
        else
        System.out.println ("1234567890 = C'est KO");

        if (Atester.presentation("émile  ").equals("Émile "))
        System.out.println ("émile = c'est OK");
        else
        System.out.println ("émile = KO");

    }
}

