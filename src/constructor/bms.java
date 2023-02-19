package constructor;

public class bms 
{
		 void book(int price)
		{
			System.out.println(" onlyprice " +price);
		}
		void book(String name)
		{
			System.out.println(" onlyname " +name);
		}
		 void book(int p,String name)
		{
			System.out.println(" printingnumber "+ p +" denstring "+ name);
		}
		 void book( String name,int p)
		{
			System.out.println(" firsttextmsg "+ name +" onlynumber "+ p);
		}
		
			public static void main(String[] args) 
			{
			bms	b=new bms();
				
			b.book( 1000 );
			b.book("  sitaramam ");
			b.book( 456 ," akshata ");
			b.book(" soumya ", 786 );

			}


	}


