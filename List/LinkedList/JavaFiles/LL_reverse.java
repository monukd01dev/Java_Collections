import java.util.*;

public class LL_reverse{


    public static void main(String[] args){

        LinkedList <String> product = new LinkedList<String>();

        product.add("AC");
        product.add("Cooler");
        product.add("Fridge");
        product.add("Almira");
        product.add("Doors");
        product.add("Tabels");
        product.add("Electronics");

        // Collections.sort(product,Collections.reverseOrder());
        Kd.listPrint(product,"Original List");

        Kd.reversePrint(product,"Reverse Order");// internally using descendingIterator() to reverse the list
    }

    
}