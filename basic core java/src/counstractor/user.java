package counstractor;

public class user {

	public static void main(String[] args)
	{
		
//car1
		car car1=new car("varna",90,"huyandai");
		//car1.manufacture="hyundai";
	//	car1.name="varna";
		//car1.speed=90;
	//	car1.wheels=4;
		car1.drive();
		car1.accelrate();
		//car2
		car car2=new car("city",120,"honda");
		//car2.manufacturer="honda";
	//	car2.name="city";
		//car2.speed=120;
	//	car2.wheels=4;
		car2.drive();
		car2.accelrate();
		//car3
		car car3=new car("mento",140,"vm");
	//	car3.manufacturer="vm";
		//car3.name="mento";
	//	car3.speed=140;
		//car3.wheels=4;
		car3.drive();
		car3.accelrate();
		
		car c =new car();//object of car class
		
	}

}
