//to get factorial of second digit present in the string
import java.util.Scanner;
import java.util.InputMismatchException;
class Factdigit 
{
	public static void main(String[] args) 
	{
		float prod = 1;
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
			int digit = num%100;
			while(digit>0){
				prod = prod*digit;
				digit--;
			}
			s2[i] = String.valueOf(prod);
			
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
