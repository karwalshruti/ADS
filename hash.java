// check duplicate
import java.util.*;
public class hash{
	public static void main(String[] args){
		char[] arr = {'a','b','c','1','2','3'};
		
		if(hasDuplicate(arr)){
			System.out.println("There is Duplicacy");
		}
		else{
			System.out.println("There is no Duplicacy");
		}
	}
	
	public static boolean hasDuplicate(char[] arr){
		
		HashSet<Character> Set = new HashSet<>();
		for(char ch:arr){
			if(!Set.add(ch)){
				return true;
			}
			Set.add(ch);
		}
		return false;
		
	}
	
}
				
	