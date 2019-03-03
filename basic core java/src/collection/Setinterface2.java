package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setinterface2 {

	public static void main(String[] args)
	{
		Set<String> set=new LinkedHashSet<>();
		set.add("aanand");
		set.add("mane");
		set.add("tech");
		set.add("bodhi");
		set.add("pune");
		
		for (String s:set)
		{
			System.out.println(s);
		}
		
		
	}

}
