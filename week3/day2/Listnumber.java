package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listnumber {
	public static void main(String[] args) {
		List<Integer> number=new ArrayList<Integer>();
		number=Arrays.asList(1,22,3,54,65,22,43);
		System.out.println(number);
		int duplicate=0;
		for(int nm : number) {
			if(nm==22) {
				duplicate++;
			}
			System.out.println("The duplicate value is" ++duplicate++);
		}
	}

}
