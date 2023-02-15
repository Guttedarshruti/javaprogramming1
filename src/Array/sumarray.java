package Array;

public class sumarray {

	public static void main(String[] args)
	{
		int a[]= {5,6,7,8,6};
		
		int sum=0;
		
		for(int i=0; i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
System.out.println("sum of Array elememts:"+sum);
	}

}
