import java.util.*;


public class LL_remove{

    public static void main(String[] args){

        LinkedList <String> names = new LinkedList<String>(Arrays.asList("Aditya","Akash","Anudip","Aryan","Amit","Ashish","Ashu","Anjan","Aryan","Ankita"));

        

        System.out.println("Without remove : ");
        Kd.listPrint(names);

        System.out.println("First remove : ");
        names.removeFirst();
        Kd.listPrint(names);


        System.out.println("Last remove : ");
        names.removeLast();
        Kd.listPrint(names);
        
        System.out.println("First Occurrence remove : ");
        names.removeFirstOccurrence("Aryan");
        Kd.listPrint(names);
        
        System.out.println("Last Occurrence remove : ");
        names.removeLastOccurrence("Aryan");
        Kd.listPrint(names);
    






    }
}