package counstractor;

public class car
{
String  name;
int speed;
String manufacturer;
static int wheels=4;

public car(String name,int speed, String manufacturer)
{
	this.name=name;
	this.speed=speed;
	this.manufacturer=manufacturer;
	}
public car()
{}

public void drive()
{
	System.out.println("drive "+manufacturer+" "+name+" car at the speed of "+speed);
	}
public void accelrate()
{
	System.out.println("accelerate "+manufacturer+" "+name+" with "+wheels+" wheels");
	}
}
