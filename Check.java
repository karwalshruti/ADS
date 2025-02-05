// check duplicate
import java.util.*;
public class Check{
	public static void main(String[] args){
		char[] arr = {'one','9149790','c','-1','1','3'};
		
		if(hasDuplicate(arr)){
			System.out.println("There is Duplicacy");
		}
		else{
			System.out.println("There is no Duplicacy");
		}
	}
	
	public static boolean hasDuplicate(char[] arr){
		int n = arr.length;
		
		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j < n ;j++){
				if(i == j){
					continue;
				}
				else if(arr[i] == arr[j]){
					return true;
				}
			}
		}
		return false;
	}
	
}
				
	