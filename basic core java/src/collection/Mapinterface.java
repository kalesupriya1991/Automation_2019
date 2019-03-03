package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class Mapinterface {

	public static void main(String[] args)
	{
		/*HashMap<String, Integer> map=new HashMap<String, Integer>();
		
		map.put("anand",30976);
		map.put("viki",30977);
		map.put("super",30978);
		map.put(null, 4234);
		map.put("anand",3097);
		
		Set<String> set=map.keySet();
		for(String key:set)
		{
		System.out.println(map.get(key));	
		}
		
		System.out.println(map.get("super"));
		System.out.println(map.get(null));   */         //allowed in hashmap

		
		Hashtable<String ,String>map2= new Hashtable<String, String>();
		
		map2.put("username", "super19");
		map2.put("password", "abc123");
		map2.put(null,"ret123");
		System.out.println(map2.get(null));             //not alloted in hashtable
		System.out.println(map2.get("username"));


	}

}
