import java.util.*;

public class LL_replace{

    public static void main(String[] args){

        LinkedList <String> fruits = new LinkedList <String>(Arrays.asList("apple","mango","banana","dragon_fruit","more"));

        fruits.set(fruits.indexOf("more"),"strawberry");

        Kd.listPrint(fruits);

    }

}