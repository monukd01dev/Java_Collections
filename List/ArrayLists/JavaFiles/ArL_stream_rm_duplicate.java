import java.util.*;
import java.util.stream.Collectors;

public class ArL_stream_rm_duplicate{

    public static void main (String[] args){

        ArrayList <Integer> numberList = new ArrayList <Integer> (Arrays.asList(5,6,4,8,9,2,5,6,3,1,4,5,2,6,3,14,5,2,3,2));
        
        System.out.println("Original Number List : "+numberList);

        List <Integer> notContainDuplicate = numberList.stream().distinct().collect(Collectors.toList());

        System.out.println("Not Contain Duplicates : "+notContainDuplicate);

        Collections.sort(notContainDuplicate);

        System.out.println("Sorted non duplicate list : "+ notContainDuplicate);




    }
    
}