import java.util.*;

public class V_subList{


    public static void main(String[] args){

        Vector <String> items = new Vector<String>(Arrays.asList("item_1","item_2","item_3","item_4","item_5","item_6","item_7"));

        List<String> newItem = items.subList(2,items.lastIndexOf(items.lastElement())+1);// plus one cause last index is not included in sublist

        // List<String> newItem = items.subList(2,items.lastIndexOf(items.get(items.size()-1))+1);
        newItem.add("zero");

        Kd.listPrint(newItem,"Sublist : ");
        Kd.listPrint(items,"Original list : ");
    }


    
}