import java.util.*;

public class ArL_subList{

    public static void main(String[] args){

        ArrayList <Integer> numberList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println(numberList);

        // List <Integer> subNumList = numberList.subList(5,10);
        ArrayList <Integer> subNumList = new ArrayList<Integer>(numberList.subList(5,10));

        System.out.println(subNumList);

    }

}