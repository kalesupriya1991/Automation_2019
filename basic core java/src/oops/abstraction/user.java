package oops.abstraction;

public class user {

	public static void main(String[] args)
	{
		RBI ref;
	String name=bankname();
	if(name.equals("SBI"))
	{
		ref=new SBI();
	}
	else if (name.equals("HDFC"))
	{
		ref=new HDFC();
		
	}
	
	



ref=new HDFC();
ref.creditcard();
ref.debitcard();
ref.savingacc();
ref.currentacc();

ref=new SBI();
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
