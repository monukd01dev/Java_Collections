import java.util.*;

public class V_colreverse{


    public static void main (String[] args){

        Vector<Integer> numbers = new Vector<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        Kd.listPrint(numbers,"normal list : ");

        //reversing the list

        Collections.reverse(numbers);

        Kd.listPrint(numbers,"Reverse list : ");

        
    }

    
}