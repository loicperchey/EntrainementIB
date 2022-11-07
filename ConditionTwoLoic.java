import java.util.ArrayList;

class  ConditionTwoLoic {
    // Loic
    public static void main(String[] args) {

        String nom="cure";
        int age = 21;

        if (age <=16 && nom !="toto")
        System.out.println(String.format("tout le monde va à l'école sauf %s", nom));
        if (age < 18 && age > 16 && nom !="toto")
        System.out.println(String.format("%s et encore à l'école", nom));
        if (age >= 18 && nom !="toto")
        System.out.println(String.format("%s est majeur", nom));
        else{
            if (age <=16 && nom =="toto")
            System.out.println(String.format("%s à l'école, c'est un cas rare", nom));
            if (age < 18 && age > 16 && nom =="toto")
            System.out.println(String.format("%s est mineur mais il n'est pas à l'école", nom));
            if (age >= 18 && nom =="toto")
            System.out.println(String.format("%s n'est toujours pas à l'école car il est majeur", nom));

        }
    }
}


