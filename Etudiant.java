public interface Etudiant {
    void donnerNom();
}
    public static void main(String[] args){
        Etudiant et = () ->{System.out.println("Toto");};
        et.donnerNom();
    }