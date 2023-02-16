package classandobject;

public class student 
{
		int sid;
		int marks;
		String sname;
		String uname;
		
		void display()
		{
			System.out.println(sid);
			System.out.println(marks);
			System.out.println(sname);
			System.out.println(uname);
			
		}
		public static void main(String[]args)
		{
			student s=new student();
			s.sid=2;
			s.marks=60;
			s.sname="vaishnavi";
			s.uname="pda";
			
			s.display();
			
			
		}
}

		
		
			
		
		
