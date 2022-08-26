package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateValue {
	public static void main(String[] args) {
		int[] number= {1,22,3,54,65,22,43,1,67,98};
		
		Set<Integer> num = new LinkedHashSet<Integer>();
		
		for (int i = 0; i < number.length; i++) {
			
			if(!num.add(number[i])){
				System.out.println(number[i]);
			}
			
		}
	}

}
