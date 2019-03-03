package testing;

import fuctions.accessmodifire;

public class testingfuction extends accessmodifire
{

	public static void main(String[] args)
	{
		
accessmodifire obj= new accessmodifire();
//obj.publicMethod();
testingfuction fun=new testingfuction();
fun.protectedMethod();//can be access outside the package with the help of child class

	}

}
