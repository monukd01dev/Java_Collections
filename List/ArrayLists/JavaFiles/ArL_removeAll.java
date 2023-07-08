import java.util.*;

public class ArL_removeAll{

    public static void main(String[] args){

        List <Integer> numList_1 = new ArrayList<Integer>(Arrays.asList(9,8,7,6,5,4,3,2,1));
        List <Integer> numList_2 = new ArrayList<Integer>(Arrays.asList(12,34,56,78,9));

        numList_1.addAll(numList_2);

        System.out.println(numList_1);

        numList_1.removeAll(numList_2);

        System.out.println(numList_1);

        numList_1.clear();

        System.out.println(numList_1);

        System.out.println((numList_1.isEmpty())? "list is Empty": "list is not Empty");
        System.out.println(numList_1.contains(2));
    
    }
}