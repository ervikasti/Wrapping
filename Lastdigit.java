
import java.util.Scanner;
import java.util.InputMismatchException;
class Lastdigit 
{
	public static void main(String[] args) 
	{
		float sum = 0;
		String s1 = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");

		try
		{
			s1  = sc.nextLine();
		}
		catch (InputMismatchException e)
		{
			System.out.println("Enter only String value");
		}

		String s2[] = s1.split(" ");
		for(int i=0;i<s2.length;i++){

		try
		{
			int num = Integer.parseInt(s2[i]);
			int digit = num%10;
			s2[i] = String.valueOf(digit);
			
		}
		catch (NumberFormatException e)
			{

			}
		}
		
		for (int i=0;i<s2.length ;i++ )
		{
			System.out.print(s2[i]+" ");
		}
		
		

	}
}
