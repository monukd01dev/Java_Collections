import java.util.*;

public class LL_pollmethods{

    public static void main(String[] args){

        LinkedList<String> jobs = new LinkedList<String>(Arrays.asList("Frontend","Backend","FullStack","DevOps","Fresher"));

        Kd.listPrint(jobs,"Original List");

        System.out.println(jobs.poll());
        Kd.listPrint(jobs,"After using poll()");

        System.out.println(jobs.pollFirst());
        Kd.listPrint(jobs,"After using pollFirst()");

        System.out.println(jobs.pollLast());
        Kd.listPrint(jobs,"After using pollLast()");
        
        
    }
    
}