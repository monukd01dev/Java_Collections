import java.util.*;

public class V_copy{

    public static void main(String[] args){

        Vector<String> names = new Vector<>(Arrays.asList("Lalit","Krishna","Amit"));

        Vector<String> friends = new Vector<String>();
        friends.addElement("Ashish");
        friends.addElement("dash");
        friends.addElement("dash1");
        friends.addElement("dash2");
        System.out.println(friends.capacity());

        System.out.println(names);
        System.out.println(friends);

        System.out.println("Now the magic begins");

        Collections.copy(friends,names);

        System.out.println(friends);

        friends.set(0,"Ayush");
        
        System.out.println("Will it effect the original list : yes!");
        System.out.println(names);
        System.out.println(friends);

        //the above is the example of immutable that's why changes will not reflected to the original list
        System.out.println("\n----------------Example of mutables -------------");

        Vector<Integer> source = new Vector<>(Arrays.asList(1,2,3));

        Vector<Integer> destination = new Vector<>(Arrays.asList(4,5,6));


        Kd.listPrint(source,"Source : ");
        Kd.listPrint(destination,"Destination : ");

        Collections.copy(destination,source);

        System.out.println("\n---------------- After copying -------------");

        Kd.listPrint(source,"Source : ");
        Kd.listPrint(destination,"Destination : ");

        // destination.addElement(4);
        destination.set(0,0);
        source.set(1,10);

        Kd.listPrint(source,"Source : ");
        Kd.listPrint(destination,"Destination : ");


    }
    
}