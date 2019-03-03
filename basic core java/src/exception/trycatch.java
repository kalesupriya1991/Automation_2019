package exception;

import java.util.Hashtable;

public class trycatch {

	public static void main(String[] args)
	{
		try
		{
			//Arithmetic exception
			
			       int a=10;
					int b=5;
					System.out.println(a/b);
					
					
					//null pointer exception
					
			Hashtable<String,String> table=new Hashtable<String,String>();
					
			table.put(null,"anand");
					System.out.println(table.get(null));
					
					
					//string index out of exception
					
					String str="a";
					System.out.println(str.charAt(1));
					Thread.sleep(5000);
					
		}
		catch (Exception e)
		{
			System.out.println("fail:Divedent is zero");
	}
		System.out.println("anand");
	

}
}