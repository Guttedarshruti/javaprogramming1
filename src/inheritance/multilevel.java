package inheritance;

class vani
{
	int a=35;
	void main()
	{
	System.out.println(a);
}
}
class megha extends vani
{
	int b=20;
	void hi()
	{
		System.out.println(b);
	}
}
class kailash extends megha
{
	int c=10;
	void by()
	{
		System.out.println(c);
	}
}
public class multilevel 
{

	public static void main(String[] args)
	{
	kailash m=new kailash();
	System.out.println(m.a);
	System.out.println(m.b);
	System.out.println(m.c);
	m.main();
	m.hi();
	m.by();
	
	

	}

}
