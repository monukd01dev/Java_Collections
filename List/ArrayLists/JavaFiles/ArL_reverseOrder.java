import java.util.*;

public class ArL_reverseOrder{


    public static void main(String[] args){

        ArrayList <Integer> numList = new ArrayList <Integer> (Arrays.asList(9,1,5,3,7,6,4,2,10,8));

        System.out.println("Natural Form of List : " + numList);

        // using reverse order on sorted list

        Collections.sort(numList,Collections.reverseOrder());

        System.out.println("Reverse order printing : " + numList);
        
        
    }

    
}