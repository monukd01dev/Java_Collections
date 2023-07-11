import java.util.*;

public class LL_indexOfMethods{

    public static void main (String[] args){

        LinkedList<String> number = new LinkedList<String>(Arrays.asList("zero","one","two","three","four","five","six","seven"));

        // indexOf method demonstration
        System.out.println(number.indexOf("one"));  
        
        System.out.println(number.lastIndexOf("seven"));  //it's just search from backward


        
    }

}