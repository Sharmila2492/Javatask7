package Task7;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();
		//Declare the String elements
		a1.add("Sneha");
		a1.add("Reena");
		a1.add("Mydhlly");
		System.out.println("print the array list:" +a1);
		//Remove all elements from the ArrayList
		a1.removeAll(a1);
		System.out.println("Print after removing all the element:" +a1);
}
}

/*Output:
	print the array list:[Sneha, Reena, Mydhlly]
	Print after removing all the element:[]
	*/
