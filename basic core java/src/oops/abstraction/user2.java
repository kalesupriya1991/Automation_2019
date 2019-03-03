package oops.abstraction;

public class user2 {

	public static void main(String[] args)
	{
		RBI ref=null;//by default null
		String name=bankname();
		
		if(name.equals("SBI")){
			ref=new SBI();
		}
		else if (name.equals("HDFC"))
		{
			ref=new HDFC();
			
		}
		
		



	
	ref.creditcard();
	ref.debitcard();
	ref.savingacc();
	ref.currentacc();

	}
	public static String bankname()
	{
		return "SBI";
	}
}
