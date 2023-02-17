package constructor;

public class parameterizedconst
{
	int x,y;
	String name;

	parameterizedconst(int a,int b,String jam)
	{
	x=a;
	y=b;
	name=jam;
	}
	void admin()
	{
	System.out.println(x);
	System.out.println(y);
	System.out.println(name);
	}
	public static void main(String[] args)
	{
		parameterizedconst cd=new parameterizedconst(10,20,"jyoti");
		cd.admin();

	}

}
