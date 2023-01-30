public class ManipulationVariables {
    public static void main(String[] args){
        int epargne = 500;
        int revenus = 2000;
        // ajouter 100 euros à votre épargne;

        epargne = epargne +100;

        //enlever 50 euros de revenu 

        revenus = revenus - 50;
        // mise a jour du délai d'épargne

        int nombreDeJoursEpargne = (5000 - revenus) / 500;

        System.out.println(nombreDeJoursEpargne);

        revenus = revenus +(30 - 10)* 7;

        System.out.println(revenus);
    }
}