package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintDulicateNumber {
	//Call main class
			public static void main(String[] args) {
				
		//declare input variables
				int[] num = {4,3,6,8,29,1,2,4,7,8};
				
		//Syntax to call set method		
				Set <Integer> set = new HashSet <Integer> ();
				
		//for loop to iterate each input data 		
		for (int i=0; i<num.length; i++)
		{
			
		//Condition: declare all the iterated i/p variable to set method('!' is used to get the not of set (i.e.,) duplicate) 
			if (!set.add(num[i]))
			{
				
		//System output to print the result: data stored in !set
				System.out.println(num[i]);
			}
			
			}
		}
		}


