package superKeyword;

class College
{
	public College()
	{
		System.out.println("This is my college");
	}
}

class Department extends College
{
	public Department()
	{
		super();
		
		System.out.println("This is a college department");
	}
	
}

public class SuperKeywordWithConstructor 
{

	public static void main(String[] args) 
	{
		Department d=new Department();
		

	}

}
