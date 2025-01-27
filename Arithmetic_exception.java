package Task7;

public class Arithmetic_exception {
	public static void div(int a, int b)
	{
		if(b==0) 
		{
			throw new ArithmeticException();
		}
		else
		{
			int c= a/b;
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
	
	try
	{
		div(10,0); 
	}
	catch(ArithmeticException e)
	{
		System.out.println("the value of b is zero");
	}

}
}
/*Output:
the value of b is zero
*/