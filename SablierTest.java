class SablierTest{
 
    public static void main(String[] args){
 
        int hauteur = 10;
        Sablier objetSablier = new Sablier();
        objetSablier.dessiner(hauteur);
    }
}
 
class Sablier{
 
    void ligneA(int t){
 
        for(int i = 0; i <=t-1; i++){
 
            System.out.print("A");
        }
        System.out.print("\n");
    }
 
    void ligneB(int t){
 
        System.out.print(" ");
 
        for(int i = 1; i <= t; i++){
 
            System.out.print(" ");
        }
        System.out.print("b\n");
    }
 
    void ligneC(int t){
 
        System.out.print(" ");
 
        for(int i = 1; i <= t; i++){
 
            System.out.print(" ");
        }
        System.out.print("c\n");
    }
 
    void dessiner(int t){
 
        ligneA(t);
 
        for(int i = 1; i <= t-2; i++){
 
            ligneB(i);
            ligneC(t-i-3);
        }
 
        ligneA(t);
    }
}