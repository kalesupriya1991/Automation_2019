package fuctions;

public class accessmodifire {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
accessmodifire obj= new accessmodifire();
obj.publicMethod();
obj.privateMethod();
obj.protectedMethod();
obj.noAccessModMethod();
	}


public void publicMethod()
{
	System.out.println("public method");
}
private void privateMethod()
{
	System.out.println("private method");
	
}
protected void protectedMethod()
{
System.out.println("protected method ");

}
void noAccessModMethod()
{
	System.out.println("no accessmod method");
}
}

