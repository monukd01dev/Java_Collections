import java.util.*;

public class V_sort{


    public static void main (String[] args){

        Vector<Integer> numbers = new Vector<Integer>(Arrays.asList(5,4,2,6,3,9,7,2,1,5,8));


        Kd.listPrint(numbers,"Before sorting : ");

        //sorting the list
        Collections.sort(numbers);
        
        Kd.listPrint(numbers,"After sorting : ");

        //sorting and reversing at the same time

        Collections.sort(numbers,Collections.reverseOrder());
        
        Kd.listPrint(numbers,"Reverse and Sort : ");
    }

    
}