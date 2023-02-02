package exceptions;

import java.util.*;

public class TemperatureAverage{
    public static void main(String[] args){
        try{

            List<Integer> recordedTemperaturesInDegreesCelcuis = new ArrayList<Integer>();
            
            // remplit la liste a partir des valeur en ligne de commande
            
        for(String stringRepresentationOfTemperature : args){
            int temperature = Integer.parseInt(stringRepresentationOfTemperature);
            recordedTemperaturesInDegreesCelcuis.add(temperature);
        }
        // if(recordedTemperaturesInDegreesCelcuis.size() == 0){
            // System.out.println("Cannot calculate average of empty list");
        // }else{

            Integer averageTemperature = SimpleMaths.calculateAverage(recordedTemperaturesInDegreesCelcuis);
            System.out.println("The average temperature is " + averageTemperature);
        // }
        
        }catch(NumberFormatException e){
            System.out.println("All arguments should be provided as number");
            System.exit(-1);
        }catch(ArithmeticException e){
            System.out.println("At least one temperature should be provided");
            System.exit(-1);
        }        
    }
}