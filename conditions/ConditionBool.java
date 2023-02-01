package conditions;

public class ConditionBool{
    public static void main(String[] args){
        
        // if/else boolean
        
        if(getBoolean()){
            console("if");
        }else{
            console("else");
        }

        if(weather(weatherToday, weatherTomorrow)){
            System.out.println(weatherToday);
        }else{
            System.out.println("les phrases ne sont pas identique et le temps n'est peut etre pas bon");
        }

        //if/elseif/else puis switch

        int nombre =  1;

        if(nombre == 1){
            console("if 1");
        }else if(nombre == 2){
            console("if 2");
        }else{
            console("else");
        }

        switch(nombre){
            case 1: 
                console("switch1");
                break;
            default:
                console("default");
        }
    }

    // afichage text des condition
    static void console(String text){
        System.out.println("Condition : " + text);
    }

    static boolean getBoolean(){
        return false;
    }

    public static String weatherToday = "the weather is good";
    public static String weatherTomorrow = "the weather issss good";

    static boolean weather(String first, String second){

        return first.equals(second);
    }
}