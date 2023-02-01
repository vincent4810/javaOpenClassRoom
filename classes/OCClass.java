package classes;

public class OCClass{
    public static void main(String[] args){
        Marque apple = new Marque("apple");

        Telephone iphone = new Telephone(34000, "iphone", apple);

        System.out.println(iphone.pixels);
        System.out.println(iphone.name);
        System.out.println(apple.name);


        // utilisation constructeur secondaire;
        Book premierDeCorde = new Book("premier de cordée", "Roger Frison-Roche", 458);

        System.out.println(premierDeCorde.title);
        System.out.println(premierDeCorde.author);
        System.out.println(premierDeCorde.numberOfPages);
        System.out.println(premierDeCorde.publisher);
        

        // utilisation constructeur primaire;
        Book second = new Book("premier de cordée", "Roger Frison-Roche", 458, "Compagnie du montblanc");
        second.numberOfPages += 10;
        System.out.println(second.title);
        System.out.println(second.author);
        System.out.println(second.numberOfPages);
        System.out.println(second.publisher);
    }
}

class Telephone{
    int pixels;
    String name;
    Marque marque;
    // constructeur de class
    public Telephone(int pixels, String name, Marque marque){
        this.pixels = pixels;
        this.name = name;
        this.marque = marque;
    }
}

class Marque{
    String name;
    // constructeur de class
    public Marque(String name){
        this.name = name;
    }
}

class Book{
    //attribut de classe;

    String title;
    String author;
    int numberOfPages;
    String publisher;

    // Constructeur secondaire de la class Book
    // Utilise le constructeur principal avec des valeurs prédéfinies;
    Book(String title, String author, int numberOfPages){
        this(title, author, numberOfPages, "OC");
    }

    //Constructeur principal de la class Book;

    Book(String title, String author, int numberOfPages, String publisher){
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
    }
}
