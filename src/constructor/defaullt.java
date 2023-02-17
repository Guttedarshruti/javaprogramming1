package constructor;

public class defaullt 
{
	int x,y;
	String name;

	defaullt ()
	{
	x=100;
	y=200;
	name="sahana";

	}
	void admin()
	{
	System.out.println(x);
	System.out.println(y);
	System.out.println(name);
	}

	public static void main(String[] args)
	{
	defaullt cd=new defaullt();
	cd.admin();
	}
}