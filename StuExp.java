import java.util.*;

class noargs extends Exception 
{
	String details;
	noargs(String s)
	{
		super(s);
	}
	/*public String toString() 
	{
		return details;
	}*/
}

class StuExp
{
	public static void main(String args[])
	{String USN;
	String name;
	int Marks;

	StuExp() throws new noargs
	{
	Scanner s=new Scanner(System.in);
		System.out.println("Enter name and USN");
		USN=s.next();
		name=s.next();
		
	
	
		System.out.println("Enter marks for three subjects");
		try{
		for(int i=0;i<args.length;i++)
			System.out.println("Marks["+i+"]:"+args[i]);
		if(args.length==0)
			throw new noargs("Exception:no data entered");
		if(args.length<0)
			throw new noargs("Exception:Negative Marks");
		}
		
		catch(noargs n)
		{
			System.out.println("Error"+n);
		}
		
	}

	
	
		
		
	}
	}