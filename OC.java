public class OC {
    public static void main(String[] args){

        String exemple = "hello";

        exemple = exemple.toUpperCase();

        exemple = exemple.replace("HELL", "YEAH");

        System.out.println(exemple);

        OCOne ocone = new OCOne();

        System.out.println("je fais de l'exemple " + ocone.exemple);
    }
}