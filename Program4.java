package practice1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Program4 {

	public static HashMap<Integer,Integer> getTotalCount(int[] arr) {
		
		int count=0;
		HashMap<Integer, Integer> map =new HashMap<>();
		for(int j=1;j<=9;j++) { //iterating for each of the numbers 1,2,3,...,9
				for(int i=0;i<arr.length;i++) { //iterating for every input element
				if(arr[i] %j==0) {
					count++; 
				}
			}
			map.put(j, count); //key= number from 1,2,..9 values= count of how many numbers were divisible by the key
			count=0;
		}
		
		for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            System.out.print(" "+entry.getKey() +":"
                             + entry.getValue());
    }
		return map;
	}
	public static void main(String args[]) {
		
		Map<Integer,Integer> map=getTotalCount(new int[] {1,2,8,9,12,46,76,82,15,20,30});
		
	}
}
