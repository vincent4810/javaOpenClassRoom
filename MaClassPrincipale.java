public class MaClassPrincipale{

    public static void main(String... args){
        Bird bird = new Bird(){
            @Override
            void fly(){
                System.out.println("Vole grâce à ses deux ailes...");
            }
        };
        bird.fly();
    }
}

class Bird{
    public Bird(){}

    void fly(){

    }
}