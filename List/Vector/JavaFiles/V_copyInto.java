import java.util.*;

public class V_copyInto{

    public static void main(String[] args){

        Vector<String> vec = new Vector<>(Arrays.asList("Delhi","Bihar","UP","Goa","Mumbai"));

        String[] arr = new String[vec.size()];

        for(String s:arr){
            System.out.print("  "+s);
        }

        System.out.println("\nAfter running copyInto method\n");

        vec.copyInto(arr);

        // vec.forEach((e)->System.out.print(e+"   "));

        for(String s:arr){
            System.out.print("  "+s);
        }

        
    }
    
}