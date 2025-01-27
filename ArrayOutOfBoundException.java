package Task7;

public class ArrayOutOfBoundException {

	public static void main(String[] args) {
		String s[]= {"Rose", "Sunflower"};
		
		try
		{
			System.out.println(s[0].charAt(5));
			System.out.println(s[4]);
		}
		catch(StringIndexOutOfBoundsException e) 
		{
		      System.out.println(e);			
		}
		
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index does not exist");
		}
		{

	}
	}

}
/*Output:
	java.lang.StringIndexOutOfBoundsException: Index 5 out of bounds for length 4*/

//If i change the character from charAT(5) to charAT(3)

/*Output:
e
Array Index does not exist*/