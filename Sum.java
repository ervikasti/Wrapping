//to count sum of all the integer and float present in the string
import java.util.Scanner;
import java.util.InputMismatchException;
class Sum 
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
			float num = Float.parseFloat(s2[i]);
			sum = sum + num;
		}
		catch (NumberFormatException e)
			{

			}
		}

		System.out.println(sum);
		

	}
}
