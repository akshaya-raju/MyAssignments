package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNumber {
	public static void main(String[] args) {
		
		int[] number= {1,22,3,54,65,22,43,67,98};
		Set<Integer> list = new LinkedHashSet<Integer>();
		
		for (int i = 0; i < number.length; i++) {
			list.add(number[i]);
			
		}
		System.out.println(list);

	
  // Set<Integer> set=new TreeSet<Integer>();
    
}
}
