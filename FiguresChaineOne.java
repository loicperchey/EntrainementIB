public class FiguresChaineOne {

    public static void CenterString(String fondEcriture, String titre){
            Integer larFond = fondEcriture.length();
            Integer larTitre = titre.length();

            Integer larPadding = (larFond-larTitre)/2;

            String paddingRight =fondEcriture.substring(0, larPadding);
            String paddingLeft =fondEcriture.substring(larFond-larPadding, larPadding);

            System.out.println(paddingLeft + titre + paddingRight);


    }
    
    public static void main( String[] args )
    {
        CenterString("000000000000000", "bonjour");
    }    
}


