package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class listinterface {

	public static void main(String[] args) 
	
	 {
		// ArrayList
		
		ArrayList <String> list = new ArrayList<>();
		list.add("anand");
		list.add("bhayere");
		list.add("pune");
		
		for(String s:list)
		{
			System.out.println(s);
		}
		
		
		//linkedList
		
		LinkedList<String> list1=new LinkedList<>();
		list1.add("Anand");
		list1.add("bhayere");
		list1.add("pune");
		
		for(String s:list)
		{
			System.out.println(s);
		}
		
	
			// vector
		
		 Vector<String> list2=new Vector<>();
		list2.add("Anand");
		list2.add("bhayere");
		list2.add("pune");
		
		for(String s:list)
		{
			System.out.println(s);
		}
	}
}
	
	



	



