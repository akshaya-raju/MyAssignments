package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetLearn {
	public static void main(String[] args) {
		
		//HashSet maintains no order--random
		Set <String> st=new HashSet<String>();
		st.add("Ak");
		st.add("Gn");
		st.add("Lin");
		System.out.println(st);
	
		
		//TreeSet maintains ascii
		Set <String> tst=new TreeSet<String>();{
		tst.add("Kumar");
		tst.add("Naveen");
		tst.add("kishore");
		System.out.println(tst);}
		
		//linkedHashSet maintains insertion order
		
		Set <Integer> lhst=new LinkedHashSet<Integer>();{
			lhst.add(6);
			lhst.add(9);
			lhst.add(0);
			System.out.println(lhst);
		}
		
		//to fetch individual data of Set since get() method cannot be used
		List<String> sets=new ArrayList<String>(st);
		//System.out.println(sets);
		String getValue=sets.get(2);
		System.out.println(getValue);
		
		
		

}}
