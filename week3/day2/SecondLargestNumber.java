package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargestNumber {
public static void main(String[] args) {
	Set<Integer> scnd=new TreeSet<Integer>();
	scnd.add(3);
	scnd.add(2);
	scnd.add(11);
	scnd.add(4);
	scnd.add(6);
	scnd.add(7);
	scnd.add(2);
	scnd.add(3);
	scnd.add(3);
	scnd.add(6);
	scnd.add(7);
	
	System.out.println(scnd.size());
	
	//Converting Set to List 
	List<Integer> lst=new ArrayList<Integer>(scnd);
	System.out.println(lst);
	
   //Printing second last Number
	System.out.println(lst.get(scnd.size()-2));
	
		
	 
		
	}

	

}


