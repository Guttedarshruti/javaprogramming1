package inheritance;

class sita
{
	int a=20;
	void disp()
	{
		System.out.println("hii");
	}
}

class rama extends sita
{
	int b=30;
	void show()
	{
		System.out.println("by");
	}
}

public class inheritancex {

	public static void main(String[] args) 
	{
		
rama r=new rama();
System.out.println(r.a);
System.out.println(r.b);
r.disp();
r.show();

	}

}
