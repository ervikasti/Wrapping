//Wraping -->Converting Primitive type to Non-primitive and vice-versa
class  Unboxing
{
	public static void main(String[] args) 
	{
		
		//converting non-primitive type to primitive(object type) is called as UnBoxing
		//UnBoxing can be done in 2 ways
		//1. datatypeValue() method
		//2. through assignment operator

		
		 Character a = new Character('c');

		 //1 using valueOf method
		 char b = a.charValue();

		 //2 using assignment
		 char c = a;

		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
	}
}
