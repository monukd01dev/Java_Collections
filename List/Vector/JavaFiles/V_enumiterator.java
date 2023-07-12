import java.util.*;

public class V_enumiterator{

    public static void main (String[] args){

        Vector<String> name = new Vector<String>(Arrays.asList("Git","GitBash","VSCode","StickyNotes","VLC"));

        Enumeration enume = name.elements();

        while(enume.hasMoreElements()){

            System.out.println(enume.nextElement()+" ");
            
        }
        
    }


}