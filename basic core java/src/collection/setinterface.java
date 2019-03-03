package collection;

import java.util.HashSet;

public class setinterface {

	public static void main(String[] args) 
	{
		//hashset
		
		HashSet <Integer>  set=new HashSet<>();
	
		set.add(10);
		set.add(20);
		set.add(10);
		set.add(20);
		for ( int a:set)
		{
			System.out.println(a);
		}
		
		//linkhashset
    /*    linkHashSet <Intiger>  set=new linkHashSet<>();
		
		set.add(10);
		set.add(20);
		set.add(10);
		set.add(20);
		for ( int a:set)
		{
			System.out.println(a);
		}*/
		
		//tree
/*		 TreeSet <Intiger>  set=new TreeSet<>();
			
			set.add(10);
			set.add(20);
			set.add(10);
			set.add(20);
			for ( int a:set)
			{
				System.out.println(a);
			}*/
		
		
	}

}
