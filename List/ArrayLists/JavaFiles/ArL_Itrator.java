import java.util.*;

public class ArL_Itrator{
	
	public static void main(String[] args){
		
		int temp;
		
		// adding elements in list using constructor 
		List <Integer> al = new ArrayList<Integer>(Arrays.asList(5,10,15,20,25));
		List <Integer> al2 = new ArrayList<Integer>(Arrays.asList(30,2,35,4,6,40,12,9));
		
		//adding the al2 list in al using addAll() methods
		al.addAll(al2);
		
		// Iterator interface methods to iterat over the ArrayList
		Iterator<Integer> itr = al.iterator();
		
		
		
		/*while(itr.hasNext()){
			System.out.println(itr.next());
		}*/
		
		System.out.println("Niche condition se");
		
		while(itr.hasNext()){
			
			temp = itr.next();
			
			System.out.println(((temp%5)==0)? temp: ("False"));
		}
		
		/*for(int i : al){
			System.out.println(((i%5)==0)? (i): ("false"));
		}*/
		
		
		
	}
	
}