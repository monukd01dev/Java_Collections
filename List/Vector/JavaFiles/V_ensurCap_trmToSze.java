import java.util.*;

public class V_ensurCap_trmToSze{

    public static void main(String[] args){


        Vector<Integer> numbers = new Vector<>(Arrays.asList(1,2,3,4,5,6,7,8,9)); 

        System.out.println(numbers.capacity());

        // numbers.ensureCapacity(15);
        // numbers.ensureCapacity(19);
        numbers.ensureCapacity(21);
        
        System.out.println("after using ensureCapacity : "+numbers.capacity());

        numbers.trimToSize();

        System.out.println("after using trim to size : "+numbers.capacity());

    }
    
}