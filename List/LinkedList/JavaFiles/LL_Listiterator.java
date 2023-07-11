import java.util.*;

public class LL_Listiterator{

    public static void main (String[] args){

        LinkedList<String> number = new LinkedList<String>(Arrays.asList("zero","one","two","three","four","five","six","seven"));

        Iterator<String> itr = number.iterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next()+" ");
        }
        
        ListIterator litr = number.listIterator();

        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }
        
    }

}