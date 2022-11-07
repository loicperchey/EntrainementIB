import java.util.ArrayList;

class  MadameIrma {
    // Loic

    public static int numeroDeLaChance(  String prenom )
    {
        int nombre = 0;
        String nomMin = prenom.toLowerCase();
        for( int i = 0 ; i < nomMin.length() ; i++ )
        {
            nombre = nombre <=50 ? nombre+(int)nomMin.charAt(i)-(int)'a' : 0;
            //System.out.println( String.format( "n° %2d  : %1c  %3d %1X" , i, charactere, codeASCII, codeASCIIMAJ    )     );
        }

        return nombre;
    }  

    public static String ChoixDeLage(Integer age){
        
        String preoccupation="";
        if(age<=12){
           preoccupation += "l'école";
        }
        else if(age>=12 && age<=20){
            preoccupation += "trucs d'ados";
        }
        else if(age>=20 && age<65 ){
            preoccupation += "le travail";
        }
        else if(age>=20 && age<=40){
            preoccupation += "les enfants";
        }
        else if(age>60){
            preoccupation += "la retraite";
        }
        return preoccupation;
    }

    public static void main(String[] args) {
        String prenom = "Gertrude";
        System.out.println( String.format( "le numéro de la chance de %s est %d et la preoccupation est %s", prenom, numeroDeLaChance(prenom), ChoixDeLage(12)));
    }
}