import java.util.*;

public class V_equals{

    public static void main(String[] args){

        Vector<String> firstVector = new Vector<>(Arrays.asList("Monu","kd","01dev"));
        
        Kd.listPrint(firstVector,"First Vector");

        Vector<String> secondVector = new Vector<>();

        secondVector.addElement("Monu");
        secondVector.addElement("kd");
        secondVector.addElement("01dev");

        Kd.listPrint(secondVector,"Second Vector");

        System.out.println(firstVector.equals(secondVector));
        
    }
    
}