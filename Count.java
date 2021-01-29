import java.util.Scanner;
import java.util.InputMismatchException;
class Count 
{
	public static void main(String[] args) 
	{
		String s1 = "";
		Scanner sc = new Scanner(System.in);
		try
		{
			s1 = sc.nextLine();
		}
		catch (InputMismatchException e)
		{
		}
		String s2[] = s1.split(" ");
		int count = 0;

		for (int i=0;i<s2.length ;i++ )
		{
			try
		{
			double num = Double.parseDouble(s2[i]);
			count++;
		}
		catch (NumberFormatException e)
		{
		}
		}
		
		System.out.println(count);

	}
}
