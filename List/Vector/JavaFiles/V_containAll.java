import java.util.*;

public class V_containAll{


    public static void main(String[] args){

        Vector<String> vec = new Vector<>(Arrays.asList("some","thing","is","wrong","in","my","head"));

        Vector<String> col = new Vector<>();
        col.addElement("thing");
        col.addElement("is");
        col.addElement("wrong");
        
        System.out.println(vec.containsAll(col));
        System.out.println(col.containsAll(vec));
    }
    
}