package superKeyword;

class School
{
	public void Standard()
	{
		System.out.println("The school has 12 standards");
	}
}

class Student extends School
{
	public void Standard()
	{
		System.out.println("The student is currently in 11th standard");
	}
	
	public void display()
	{
		//will call the current method of the class
		Standard();
		
		//will call the method of the parent class
		super.Standard();
	}
}

public class SuperKeywordWithMethod 
{

	public static void main(String[] args) 
	{
		Student s=new Student();
		s.display();

	}

}
