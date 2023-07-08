import java.util.*;

public class ArL_toArray{


    public static void main(String[] args){

        List <Integer> numList = new ArrayList<Integer>(Arrays.asList(4,5,58,96,81,52,36));

        Integer  convertedArray[] = new Integer[numList.size()];

        convertedArray = numList.toArray(convertedArray);

        System.out.println(Arrays.toString(convertedArray));

        System.out.println(convertedArray.length);//convertedArray.length() in wrong

      
    }
}