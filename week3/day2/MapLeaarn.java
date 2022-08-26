package week3.day2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapLeaarn {
	public static void main(String[] args) {
		
		//HashMap-->randomly 
		Map <Integer,String> mp=new HashMap<Integer,String> ();
		mp.put(1,"Ak");
		mp.put(3,"Ri"); 
		mp.put(5,"Lin");
		mp.put(0,"Lk");
		System.out.println(mp);
		
		
		
		//TreeMap-->maintains order based on key
		Map <Integer,String> tmp=new TreeMap<Integer,String> ();
		tmp.put(4, "Kiko");
		tmp.put(7,"Giga");
		System.out.println(tmp);
		
		
		//LinkedHashMap---based on insertion
		Map <Integer,String> lmp=new LinkedHashMap<Integer,String> ();
		lmp.put(2,"Priya");
		lmp.put(1, "Oviya");
		lmp.put(2,"line");
		System.out.println(lmp);
		System.out.println(lmp.get(1));
	
		Set<Entry<Integer,String>> entrySet=mp.entrySet();
		for(Entry<Integer,String> eachEntry:entrySet) {
			
			
			System.out.println(eachEntry.getKey()+"->"+(eachEntry.getValue()));
			
			
			
				
			}
		}
	}


