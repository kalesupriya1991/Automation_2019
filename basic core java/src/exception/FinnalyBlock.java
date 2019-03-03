package exception;

public class FinnalyBlock {

	public static void main(String[] args)
	{
try
{
	int a=10;
	int b=10;
	int c=a/b;
	System.out.println(c);


}catch (Exception e)
{
	System.out.println(e.getMessage());

}finally
{
	System.out.println("finally block");
}
	}

}
