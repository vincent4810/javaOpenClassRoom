package fonctionParametre;

public class FonctionParametre{

    public static void main(String[] args){
        displayPerimeter(5,9);

        displayPerimeter(4,6);

        int newSum = sum(5,6);
        System.out.println(newSum);

        int sumMax = sum(newSum, 1000);

        System.out.println(sumMax);

        // video 
        // type valeur =  variable simple;
        String nom1 = "Jean";
        String nom2 = nom1;

        nom1 = "Laurent";
        
        afficheNom(nom1);
        afficheNom(nom2);
        // type référence = quand utilisation Class
        Personne personne1 = new Personne("Yohan");
        Personne personne2 = personne1;

        personne1.nom = "Claude";

        afficheNom(personne1.nom);
        afficheNom(personne2.nom);


    }

    static void displayPerimeter(int length, int width){
        int perimeter = 2 * (length + width);
        System.out.println(perimeter);
    }

    static int sum(int a, int b){
        int calc = a+b;

        return calc;
    }

    static void afficheNom(String text){
        System.out.println("-> " + text);
    } 
}

class Personne{
    String nom;

    Personne(String nom){
        this.nom = nom;
    }
}