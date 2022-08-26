package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listname {
	public static void main(String[] args) {
		List <String> name=new ArrayList<String>();
		name.add("Karthi");
		name.add("Arun");
		name.add("Dev");
		name.add("Selva");
		name.add("Anbu");
		name.add("Sekar");
		name.add("Sekar");
		name.add(3,"Akshu");
		name.set(4,"Nawab");
		name.add("rishi");
		name.remove(3);
		
		name.remove("Nawab");
		
		int size=name.size();
		System.out.println(size);
		
		System.out.println(name);
		//name.clear();
		boolean emp=name.isEmpty();
		System.out.println(emp);
		//
		System.out.println(name.get(5));
		
	//	for(int i=0;i<size;i++) {
		//	System.out.println(name.get(i));
		Collections.sort(name);
		for(String eachName : name) {
			System.out.println(eachName);
			
		}
		
	/*	for(String eachName:name) {
			if(eachName.startsWith("S")){
		
			System.out.println(eachName );
		}
			

			
			
		/*	List <Number> num=new ArrayList<Number>();
					num.add(3);
			num.add(5)
			;
			System.out.println(num);*/
}}


