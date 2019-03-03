package stringclass;

public class stringfuctions {

	public static void main(String[] args)
	{
		String name=" supriyaa ";
		String name2="Supriya";
		String name3=" Supriya$ Mane$techbodhi$pune";
		String name4="supriyaABCmaneABCtechbodhiABCpune";
		
		
		System.out.println((name.length())-(name.replace("a", "").length()));
		
		//split
		String[] str=name4.split("ABC");//string array
		for (String s:str)
		{
			System.out.println(s);
		}
		String[] str2=name4.split("AB.*?",2);
		for(String s:str2)
		{
			System.out.println(s);
		}
		
		//replace
		System.out.println(name.replace('s', 'a'));//singal cort for char
		System.out.println(name.replace("$", ""));//double cort for string
		System.out.println(name4.replace("ABC","sss"));
		
		
		
		
		//substring
		System.out.println(name3.substring(9)); //begin index i.e surname
		System.out.println(name3.substring(0,8)); //prints between begin and end index
		
		
		
		// Trim
		System.out.println(name);
		System.out.println(name.trim()); //trim avoid the space
		
		
		//equals and equalsInorecase
		System.out.println(name.equals(name2));
		System.out.println(name.equalsIgnoreCase(name2));
		
		
		// length
		int l=name.length();
		System.out.println(l);
		
		
		//charAt
	char c=	name.charAt(0);
	System.out.println(c);

	}

}
