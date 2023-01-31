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

        int[] secondArray = { 10, 20, 30, 40, 50, 60, 70, 80, 90};

        for(int i = 0; i <secondArray.length; i++){
            if(secondArray[i] == 50){
                System.out.println("J'ai trouvé mon " + secondArray[i] + "!");
                break;
            }
            System.out.println("J'en suis à " + secondArray[i] + " ...");
        }

        for(int i=0; i < 10; i++){
            if(i == 2 || i == 5){
                continue;
            }
            System.out.println("Valeur de i : " + i +".");
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