import java.util.*;

public class V_listiterator{


    public static void main(String[] args){

        Vector <String> items = new Vector<String>(Arrays.asList("item_1","item_2","item_3","item_4","item_5","item_6","item_7"));

        ListIterator<String> litr = items.listIterator();

        while(litr.hasNext()){
            litr.next();
        }


        while(litr.hasPrevious()){
            System.out.println(litr.previous()+"    ");
        }

    }


    
}