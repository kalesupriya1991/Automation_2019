package veriables;

public class day2 {

	public static void main(String[] args) 
	{
		day1 obj= new day1();
		System.out.println(obj.city);//calling non static veriables by using object
		
		System.out.println(day1.country);//calling static variables by using class
		
		
/*int a=3;
int b=7;
System.out.println(a+b);
System.out.println(a-b);
System.out.println(a/b);

System.out.println(a*b);
System.out.println(b%a);
a=b;
System.out.println(a);
System.out.println(b);*/


int a=7;

int b=2;

a=(a+b);                          //Swapping the number without using 3rd veriabl
b=(a-b);
a=(a-b);
System.out.println(a);
System.out.println(b);

	}

}
