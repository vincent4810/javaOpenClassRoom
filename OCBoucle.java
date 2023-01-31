public class OCBoucle {
    public static void main(String[] args){
        bonjour("vincent");

        for(int i=0; i<=1000; i++){
            bonjour(Integer.toString(i));
        }
    }

    static void bonjour(String nom){
        System.out.println("Bonjour " + nom + " !!");
    }
}