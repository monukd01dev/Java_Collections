import java.util.*;

public class LL_offermethods{

    public static void main(String[] args){

        LinkedList<String> numbers = new LinkedList<String>(Arrays.asList("one","two","three","four","five","six","seven"));

        Kd.listPrint(numbers,"Original List");

        numbers.offer("eight");
        Kd.listPrint(numbers,"After using offer(\"eight\")");

        numbers.offerFirst("zero");
        Kd.listPrint(numbers,"After using offerFirst(\"zero\")");
        
        numbers.offerLast("nine");
        Kd.listPrint(numbers,"After using offerLast(\"nine\")");
        
    }
    
}