import java.util.*;

public class LL_getMethods{

    public static void main (String[] args){

        LinkedList <String> number = new LinkedList<String>(Arrays.asList("one","two","three","four","five","six"));

        //get method demonstration
        System.out.println(number.get(2));

        System.out.println(number.getFirst());

        System.out.println(number.getLast());

    }
    
}