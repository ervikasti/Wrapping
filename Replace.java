//To replace int value in given string with half of the value
class Replace 
{
	public static void main(String[] args)  
	{
		String s1 = "Hi Mr. 50 how are you doing 404 found";
		String s2[] = s1.split(" ");
		for (int i=0;i<s2.length;i++ )
		{
			try
			{ 
				//Coverting String type to Integer object type and Unboxing also simultaneously
				int num = Integer.parseInt(s2[i]);

				s2[i]  = String.valueOf(num/2);

			}
			catch (NumberFormatException e)
			{

			}
		}
		
		for(String s3 : s2){
			System.out.print(s3+" ");
		}
		
	}
}
