import java.util.*;


public class ArL_Generic{

	public static void main(String[] args){
		
		//ArrayList Generic 
		List <Integer> numList = new ArrayList<Integer>();
		
		
		//Adding elements using add();
		
		numList.add(10);
		numList.add(11);
		numList.add(12);
		numList.add(13);
		numList.add(14);
		numList.add(16);
		numList.add(16);
		numList.add(17);
		
	//	numList.add(5,15); // this method only add not replacing the error that i have did
		numList.set(5,15);
		
		//Printing the ArrayList using for loop using Size method and get() method
		
		for(int i = 0; i<numList.size(); i++){
			System.out.print(numList.get(i)+ "	");
		}
		
	}

}