import java.util.*;

public class ArL_addAll
{

    public static void main(String[] args)
    {
        List <Integer> list_1 = new ArrayList<Integer>(Arrays.asList(2,4,6,8,10));

        List <Integer> list_2 = new ArrayList<Integer>(Arrays.asList(11,12,13,14,15));

        System.out.println(list_1);

        // using addAll() method to add the list_2 to list_1

        list_1.addAll(list_2);

        System.out.println(list_2);
        System.out.println(list_1);

    }
}