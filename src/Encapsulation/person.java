package Encapsulation;

public class person
{
	private int age;
	private String name;

	public int getage()
	{
	return age;
	}

	public void setage(int age)
	{
	if(age>30)
	{
	System.out.println("you are not eligible for the policy");
	}
	else
	{
	this.age=age;
	}
	}

}
