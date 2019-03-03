package collections;

import java.util.*;



public class MapInterface {

	public static void main(String[] args) 
	{
		
		// Hash Map - key and Value format
		
		HashMap<String , Integer> map = new HashMap<String , Integer>();
		
		map.put("Rakesh" , 114112);
		map.put("Aditya", 114111);
		map.put("Atharva" , 114113);
		map.put(null , 11333);
		map.put("Rakesh", 11111111); // will take latest Value
		
		
		
		Set<String> set = map.keySet();
		
		for(String key:set)
		{
			
			System.out.println(map.get(key));
		}
		
		
		
	//	System.out.println(map.get(null));
		
		Hashtable<String , String> map2 =  new Hashtable<String , String>();
		
		map2.put("Rakesh" , "PWD123");
		map2.put("Aditya", "PWD345");
		map2.put("Atharva" , "PWD789");
		map2.put(null, "xyzzz");
		
		
	//	System.out.println(map2.get(null));

	}

}
