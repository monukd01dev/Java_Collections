import java.util.*;

public class LL_subList{

    public static void main (String[] args){

        LinkedList<String> number = new LinkedList<String>(Arrays.asList("zero","one","two","three","four","five","six","seven"));

        // sublist method demonstration

        // LinkedList<String> names = number.subList(1,6);
        LinkedList<String> names = new LinkedList<String>(number.subList(1,6));

        names.removeFirst();


        Kd.listPrint(names);  
        Kd.listPrint(number);  


        
    }

}