package superKeyword;

class Vehicle
{
	int maxSpeed=100;
	
	public void display()
	{
		System.out.println("The max speed of vehicle is " + maxSpeed);
	}
}

class Car extends Vehicle
{
	int maxSpeed=160;
	
	public void display()
	{
		System.out.println("The max speed of car is: " + super.maxSpeed);
	}
}

public class SuperKeywordWithVariable 
{

	public static void main(String[] args) 
	{
		Car car=new Car();
		car.display();

	}

}
