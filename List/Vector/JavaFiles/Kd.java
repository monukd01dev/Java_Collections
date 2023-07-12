
import java.util.*;

public class Kd{

    public static <T> void listPrint (List<T> list){

        Iterator<T> itr = list.iterator();

        while(itr.hasNext()){

            System.out.print(itr.next()+"   ");
            
        }
        System.out.println();

    }
    

    public static <T> void listPrint (List<T> list,String message){

        Iterator<T> itr = list.iterator();

        System.out.print(message + " : ");
        while(itr.hasNext()){

            System.out.print(itr.next()+"   ");
            
        }
        System.out.println();

    }
    

    public static <T> void reversePrint (LinkedList list){

        Iterator<T> itr = list.descendingIterator();

        while(itr.hasNext()){

            System.out.print(itr.next()+"   ");
            
        }
        System.out.println();

    }
    
    

    public static <T> void reversePrint (LinkedList list,String message){

        Iterator<T> itr = list.descendingIterator();

        System.out.print(message + " : ");
        while(itr.hasNext()){

            System.out.print(itr.next()+"   ");
            
        }
        System.out.println();

    }
    

}