import java.util.*;

public class V_descendingIterator{


    public static void main (String[] args){

        Vector<Integer> numbers = new Vector<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        Kd.listPrint(numbers,"normal list : ");

        //using descendig iterator

        // Iterator<Integer> itr = numbers.descendingIterator();
        // the above code will not work on it see the notes to learn


        while(itr.hasNext()){

            System.out.println(itr.next()+" ");
        }
        
    }

    
}