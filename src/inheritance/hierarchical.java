package inheritance;

class mani
{
	void manager(int a)
	{
		System.out.println("hii");
	}
}
class hemanth extends mani
{

	void mira(int b)
	{
		System.out.println("bye");	
	}
}
class anil extends mani
{
	void disp(int c)
	{
		System.out.println("yashu");
	}

	public void mira(int i) {
		// TODO Auto-generated method stub
		
	}
}
	
	public class hierarchical
{

	public static void main(String[] args) 
	{
anil a=new anil();
a.manager(20);
a.mira(10);
a.disp(30);

	}

}
