package classes;

public class ClassHeritagePolymorphisme{

    public static void main(String[] args){
        Voiture voiture = new Voiture();
        voiture.start();
        // voiture.allumerFeux();

        Bateau bateau = new Bateau();
        bateau.start();
    }
}

class Vehicule{
    void start(){
        System.out.println("VROOM");
    }

}

class Voiture extends Vehicule{
    // Utilisation de @Override quand on surcharge la class mère
    @Override
    void start(){
        // super. mot clef pour la class mère

        super.start();
        allumerFeux();
    }
    
    void allumerFeux(){
        System.out.println("Allumage feux");
    }
}

class Bateau extends Vehicule{

}