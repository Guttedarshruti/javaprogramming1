package string;

public class splitmethod {

	public static void main(String[] args)
	{
		String s="vaishnavi,srija";
		String a[]=s.split(",");
		System.out.println(a[1]);
		System.out.println(a[0]);
		String s2="guttedarshruti@gmail.com";
		String a2[]=s2.split("@");
		System.out.println(a2[0]);
		System.out.println(a2[1]);
	}

}
