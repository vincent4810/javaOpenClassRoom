package exceptions;

import java.util.*;

public class SimpleMaths{
    public static int calculateAverage(List<Integer> listOfIntegers){
        int average = 0;
        if(listOfIntegers.size() == 0){
            return 0;
        }
        for(int value: listOfIntegers){
            average += value;
        }

        average /= listOfIntegers.size();

        return average;
    }
}