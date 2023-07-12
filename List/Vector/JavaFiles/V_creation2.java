import java.util.*;

public class V_creation2{

    public static void main (String[] args){

        Vector<Integer> numbers = new Vector<Integer>(4,6);

        numbers.addAll(Arrays.asList(1,2,3,4));

        System.out.println("Capacity of vector : "+numbers.capacity());
        System.out.println("Size of vector : "+numbers.size());

        numbers.addElement(5);

        System.out.println("\nCapacity of vector : "+numbers.capacity());
        System.out.println("Size of vector : "+numbers.size());

        numbers.addAll(Arrays.asList(6,7,8,9,10,11));

        System.out.println("\nCapacity of vector : "+numbers.capacity());
        System.out.println("Size of vector : "+numbers.size());

    }
    
}