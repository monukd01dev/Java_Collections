import java.util.*;

public class LL_peekmethods{

    public static void main(String[] args){

        LinkedList<String> numbers = new LinkedList<String>(Arrays.asList("one","two","three","four","five","six","seven"));

        Kd.listPrint(numbers,"Original List");

        System.out.println(numbers.peek());
        Kd.listPrint(numbers,"After using poll()");

        System.out.println(numbers.peekFirst());
        Kd.listPrint(numbers,"After using pollFirst()");

        System.out.println(numbers.peekLast());
        Kd.listPrint(numbers,"After using pollLast()");
        
        
    }
    
}