package oops.encapsulation;

public class bank
{
private int balance;

private String coustermername;


public int getBalance()
{
	return balance;
}

public void setBalance(int balance)
{
	if(balance>1000)
	
	this.balance = balance+150;
}

		

public String getCoustermername() 
{
	return coustermername;
}

public void setCoustermername(String coustermername)
{
	this.coustermername = coustermername;
}




}
