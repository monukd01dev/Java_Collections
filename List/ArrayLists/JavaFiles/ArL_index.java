// demonstration of get(index) indexOf(element) lastIndexOf(element) Collections.sort(List) set(index,element)
import java.util.*;

public class ArL_index{


    public static void main(String[] args){

        List <String> numList = new ArrayList<String>();

        // adding elements using add()

        numList.add("9");
        numList.add("8");
        numList.add("7");
        numList.add("6");
        numList.add("5");
        numList.add("4");
        numList.add("3");
        numList.add("2");
        numList.add("1");

        System.out.println(numList);

        // demonstration of sort() 
        Collections.sort(numList);

        System.out.println(numList);

        // demonstration of get()

        for(int i = 0; i<numList.size(); i++){
            
            System.out.println(numList.get(i));
        }

        // demonstration of indexOf() 

        System.out.println("indexOf Demonstration");

        for(int i = 0; i<numList.size(); i++){
            
            if( ( (Integer.parseInt(numList.get(i))) % 2 ) == 0)
            {
                System.out.println (numList.get((numList.indexOf(numList.get(i)))));
                // System.out.println(numList.get(i));
            }
        }

        System.out.println("Demonstration of lastIndexOf() ");

        numList.set(7,"12");
        System.out.println(numList.lastIndexOf("8"));
        System.out.println(numList.indexOf("12"));

        

    }
}