public class OCBoucle {
    public static void main(String[] args){
        bonjour("vincent");

        for(int i=0; i<=1000; i++){
            bonjour(Integer.toString(i));
        }
        int[] myArray = new int[]{7,2,4};
        for(int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }

        for(int numberToArray: myArray){
            System.out.println(numberToArray);
        }
    }

    static void bonjour(String nom){
        System.out.println("Bonjour " + nom + " !!");
    }
}