package conditions;

public class ConditionalHello{

    public static void main(String[] args){
        if(args.length == 1){
            sayHelloTo(args[0]);
        }else{
            sayHelloTo("world");
        }
    }

    public static void sayHelloTo(String recipient){
        System.out.println("Hello " + recipient + "!");
    }
}