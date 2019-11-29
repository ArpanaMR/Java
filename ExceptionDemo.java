import java.util.*;

class Wrongage extends Exception 
{
	String details;
	Wrongage(String s)
	{
		details=s;
	}
	public String toString() 
	{
		return details;
	}
}

 class Father {
	int age;
	Father(int s) throws Wrongage {
		System.out.print("Enter father's age: ");
		age = new Scanner(System.in).nextInt();
		if (age <= s || age < 0 || s < 0) 
			throw new Wrongage("Wrong age");
	}	
 }

class Son extends Father {
	int x;
	Son(int s) throws Wrongage {
		super(s);
		x = s;
	}
}

class ExceptionDemo {
	public static void main(String[] args) 
{
		Scanner se=new Scanner(System.in);
		System.out.print("Enter son's age: ");
		try
		 {
				int s=se.nextInt();
				Son s1=new Son(s);
		} 
		catch (Wrongage e) 
		{
			System.out.println("Age Exception:  "+e);
		}
}
}