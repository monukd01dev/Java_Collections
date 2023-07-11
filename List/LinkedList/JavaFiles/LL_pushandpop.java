import java.util.*;

public class LL_pushandpop{

    public static void main(String[] args){

        LinkedList <String> fruits = new LinkedList <String>(Arrays.asList("apple","mango","banana","dragon_fruit","more"));

        fruits.push("monuKd");
        
        // System.out.println(fruits.push("monuKd")); why push will return

        Kd.listPrint(fruits);

        System.out.println(fruits.pop()); // no arguments why... really!

        Kd.listPrint(fruits);

        fruits.clear();

        try{
            fruits.pop();
        }catch(Exception e){
            System.out.println(e);
        }

    }

}