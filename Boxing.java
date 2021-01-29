//Wraping -->Converting Primitive type to Non-primitive and vice-versa
class  Boxing
{
	public static void main(String[] args) 
	{
		
		//converting primitive type to nonprimitive(object type) is called as Boxing
		//Boxing can be done in three ways
		//1. constructor
		//2 .valueOf() method
		//3. through assignment operator
		char ch = 'a';

		//1 constructor
		 Character a = new Character(ch);

		 //2 using valueOf method
		 Character b = Character.valueOf(ch);

		 //3 using assignment
		 Character c = 'a';

		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
	}
}
