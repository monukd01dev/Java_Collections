import java.util.*;

public class V_creation1{

    public static void main(String[] args){

        //second way to create vector 

        Vector<Integer> number = new Vector<Integer>(2);

        //adding elements

        number.addElement(1);
        number.addElement(1);//capacity 2
        number.addElement(1);//capacity 4
        number.addElement(1);
        number.addElement(1);//capacity 8
        
        
        System.out.println("Size of vector : "+number.size());
        System.out.println("Capacity of vector : "+number.capacity());

        
    }
    
}