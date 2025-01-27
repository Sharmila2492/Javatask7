package Task7;

public class ThrowKeyword {

	public static void Checkage(int age)
	{
		if(age<18) {
			throw new ArithmeticException("Invalid age Exception");
			}
	}
	public static void main(String[] args) {
	try {
		Checkage(15);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Invalid Age Exception");
	}
	  System.out.println("Rest of the code");

	}

}

/*Output:
Invalid Age Exception
Rest of the code
*/