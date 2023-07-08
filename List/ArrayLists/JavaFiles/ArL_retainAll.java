import java.util.*;

public class ArL_retainAll{

    
    public static void main(String[] args){
        
        ArrayList <Integer> numberList = new ArrayList <Integer> (Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        ArrayList <Integer> evenList = new ArrayList <Integer> (Arrays.asList(2,4,6,8,10));

        System.out.println("Natural Number List : "+ numberList);
        System.out.println("Even Number List : "+ evenList);

        System.out.println("Retaining even number from natural numbers :-");

        numberList.retainAll(evenList);

        System.out.println("Natural Number List After retain : "+ numberList);


    }

}