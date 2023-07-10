import java.util.*;

public class LL_add{

    public static void main(String[] args){

        LinkedList <String> people = new LinkedList<String>();
        LinkedList <String> new_people = new LinkedList<String>(Arrays.asList("Lalit","Krishna","Amit","Ashish","Ashu"));

        //using Collection interface add methods

        people.add("Anuj");
        people.add("Sabre");
        people.add("Shivam");

        people.add(0,"Manish");

        // adding two linked lists

        people.addAll(new_people); // it will add the elements at the last

        people.addAll(0,new_people);

        // add methods of linkedlist

        //adding to the first
        people.addFirst("Monu");

        //adding to the last
        people.addLast("Kd_bro");

        Iterator<String> itr = people.iterator();


        while(itr.hasNext()){
            
            System.out.println(itr.next());
            
        }
        
    }
    
}