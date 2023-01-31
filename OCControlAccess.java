public class OCControlAccess {
    public static void main(String[] args){
        System.out.println(Exemple.text);
        Exemple.printText();
    }
}

class Exemple {
    // private / protected / public   class / variables / fonction.
    private static String text = "hello World";

    public static void printText(){
        System.out.println(text);
    }
}