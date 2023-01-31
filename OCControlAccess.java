public class OCControlAccess {
    public static void main(String[] args){
        System.out.println(Exemple.text);
        Exemple.printText();
    }
}

class Exemple {
    // private / protected / public / package protected /////  class / variables / fonction.
    protected static String text = "hello World";

    public static void printText(){
        System.out.println(text);
    }
}