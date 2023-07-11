import java.util.*;

public class LL_LLtoAr{

    public static void main (String[] agrs){

        LinkedList<String> linkedlist = new LinkedList<String>(); 
        linkedlist.add("Larry"); 
        linkedlist.add("Maddy"); 
        linkedlist.add("Chetan"); 
        linkedlist.add("Chauhan"); 
        linkedlist.add("Singh"); 

        String[] names = linkedlist.toArray(new String[linkedlist.size()]);

        System.out.println(names.length);
    }
}