package Exception;

public class handleexception 
{
	void display()
	{
	try
	{
	int a=5/0;
	}
	catch(ArithmeticException e)
	{
	System.out.println(e);
	}
	}
	}
	class Except
	{
	public static void main(String[]args)
	{
	Except E=new Except();
	E.display();
	}

	private void display() {
		// TODO Auto-generated method stub
		
	}
	}
	