import java.util.*;

public class ArL_NonGeneric{
	
	
	public static void main(String[] args){
		
		// Represeting Non Generic 
		List arrlist = new ArrayList();
		
		// using add method to add 
		arrlist.add("Monu Kumar");
		arrlist.add(19);
		arrlist.add(19.5f);
		arrlist.add(1945l);
		arrlist.add('J');
		System.out.println(arrlist);
		
		// adding at specified index using add(INDEX,Object) method
		// it will only add the object at the specified index and the
		// element which have already there was shifted to the next index
		arrlist.add(2,"Java Developer");
		
		// remove(object) and remove(index)
		arrlist.remove(1945l);
		try{
		arrlist.remove(5);
		}catch(Exception e){
			System.out.println(e);
		}
		// the code above will give error indexOutOfBound
		arrlist.remove(4);
		
		System.out.println(arrlist);
		System
	}
	
}