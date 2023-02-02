package arrays;

// import des class List et ArrayList pour pouvoir utiliser les outils de ces class List et ArrayList
import java.util.List;
import java.util.ArrayList;

public class Array{

    public static void main(String[] args){
        // une fois tableau déclarer impossible de modifier taille et type alors qu'en php on peut rentrer n'importe quel type dans un tableau.
        
        String[] tableau = new String[10];

            tableau[3] = "Index3";
            
            tableau[1] = "Index1";
            
            tableau[3] =  "nouveeau text";

        for(int i = 0; i < tableau.length; i++){
            System.out.println(tableau[i]);
        }

        // tableau multidimensionnel par exemple 30 rang de 12 sieges dans un théatre

        String[][] monTheatrePlace = new String[30][12];

        monTheatrePlace[4][5] = "james Logan";
        // parcourir un tableua à deux dimension ;
        for(int i=0; i < monTheatrePlace.length; i++){

            for(int j = 0; j < monTheatrePlace[i].length; j++){
                System.out.println(monTheatrePlace[i][j]);
            }
        }

        // En java il existe des liste pour créer des sorte de tableau mais sans taille fixe

        List<String> maListe = new ArrayList<String>();
            // .add ajoute à une liste
            maListe.add("Ski");
            maListe.add(0,"Snowboard");
            maListe.add(0,"SnowScoot");
            // .set remplace
            maListe.set(2, "parapente");
            // .set Supprime
            maListe.remove(1);
            // .size Donne la taille de la liste 
            System.out.println(maListe.size());
            
            // Utilisation du for sous la forme foreach pour afficher les élément de la liste

            for(String result: maListe){
                System.out.println(result);
            }

    }
}