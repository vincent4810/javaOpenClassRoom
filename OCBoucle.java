public class OCBoucle {
    public static void main(String[] args){
        int e = 0;
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

        while(e < 90){
            e =  randomNumber();
            
            print(e);
        }
    }

    static void bonjour(String nom){
        System.out.println("Bonjour " + nom + " !!");
    }

    static void print(int nombre){
        System.out.println("Nombre : " + Integer.toString(nombre));
    }

    static int randomNumber(){
        return (int) ((Math.random() * ((100-1) + 1)) + 1);
    }
}