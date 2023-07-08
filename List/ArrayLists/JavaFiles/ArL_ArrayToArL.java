// demonstration of Collections.addAll(Collection,Array)

import java.util.*;

public class ArL_ArrayToArL{


    public static void main(String[] args){

        ArrayList <Integer> numList = new ArrayList<Integer>();

        System.out.println(numList.isEmpty());

        Integer[] arraylst = new Integer[]{1,2,3,4,5,6,7,8,9,10};

        // using Collections.addAll() to adding an array to ArrayList and converting an array to ArrayList

        Collections.addAll(numList,arraylst);

        System.out.println(numList.isEmpty());

        Iterator<Integer> itr = numList.iterator();

        while(itr.hasNext()){
            System.out.print("  "+ itr.next());
        }

        //shuffle the ArrayList without random function

        Collections.shuffle(numList);

        System.out.println("\n"+numList);

        Collections.sort(numList);

        System.out.println(numList);

        // shuffel with Random()

        Collections.shuffle(numList,new Random());
        
        System.out.println(numList);

        Collections.sort(numList);

        // shuffel with Random()

        Collections.shuffle(numList,new Random(2));

        System.out.println(numList);
    
    }


}