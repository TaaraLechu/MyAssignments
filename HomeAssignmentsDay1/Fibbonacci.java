package HomeAssignments;

public class Fibbonacci {

	public static void main(String[] args)
	{
		int num=8,firstdigit=0,seconddigit=1;
		System.out.println("Fibonacci Series are " + num +"");
		for(int i=1;i<=num;++i)
		{
			 System.out.print(firstdigit + ", ");
			int nextno=firstdigit+seconddigit;
			firstdigit=seconddigit;
			seconddigit=nextno;
			 
			    
			}
		}
		
	}

