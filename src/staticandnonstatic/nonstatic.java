package staticandnonstatic;

public class nonstatic
{
int b=10;

void s2()
{
	System.out.println("this is non static");
}
	public static void main(String[] args)
	{
nonstatic	m1=new nonstatic();
System.out.println(m1.b);
m1.s2();

	}

}
