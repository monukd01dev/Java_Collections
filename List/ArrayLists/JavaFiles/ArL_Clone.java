import java.util.*;

public class ArL_Clone{

    public static void main(String[] args){

        ArrayList <Integer> numlist = new ArrayList <Integer> (Arrays.asList(15,23,45,87,96,65,23,58));

        ArrayList <Integer> clone_list = (ArrayList<Integer>)numlist.clone();

        System.out.println(numlist);
        System.out.println(clone_list);

        System.out.println("mai haya isme kuch update karne wala hune add and remove");

        numlist.add(0,24);
        numlist.set(2,31);
        System.out.println(clone_list);
        System.out.println(numlist);



    }

}
 
