package inheritance;
class home
{
	void call()
	{
		System.out.println("overriden");
	}
}
class suma extends home
{
	void call()
	{
		System.out.println("overriden method");
	}
}
class akku extends home
{
	void call()
	{
		System.out.println("method overriden");
	}
}
public class overiding
{

	public static void main(String[] args)
	{
		akku a=new akku();
		a.call();

	}

}
