package constructor;

public class methodoverloading 
{
int x,y,z;
String s;
 
void method()
{
x=10;
y=20;
System.out.println(x);
System.out.println(y);
}

void method(int a,int b)
{
x=a;
y=b;
System.out.println(x+y);
}
void method(int a,String s)
{
x=a;
s="hi";
System.out.println(s);
}

	public static void main(String[] args)
	{
		
methodoverloading md=new methodoverloading();
md.method();
md.method(10,20);
md.method(30,"hello");
	}

}
