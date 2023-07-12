import java.util.*;

public class V_creation{

    public static void main (String[] args){

        // the first way to creat vector
        Vector<String> v1 = new Vector<String>(Arrays.asList("one","two","three","four","five","six","seven","eight","nine","ten"));

        Kd.listPrint(v1);

        System.out.println("Size of the v1 : " + v1.size());

        // vi.addFirst()//don't work on it
        // v1.addElement(0,"new");// it takes only E
        v1.addElement("-one");
        v1.add(0,"zero");
        
        Kd.listPrint(v1);

        System.out.println("Size of the v1 : " + v1.size());

        System.out.println("Using Iterator to print the list : ");
        
        Iterator<String> itr = v1.iterator();

        while(itr.hasNext()){

            System.out.println(itr.next());

        }

        //this will only work with LinkedList
        // Iterator<String> itr1 = v1.descendingIterator();

        // while(itr1.hasNext()){
        //     System.out.println(itr1.next());
        // }

        Collections.sort(v1,Collections.reverseOrder());

        Kd.listPrint(v1);

    }
    
}