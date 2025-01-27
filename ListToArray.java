package Task7;

import java.util.ArrayList;

public class ListToArray {

	public static void main(String[] args) {
		ArrayList<String> flower=new ArrayList<>();
		flower.add("Rose");
		flower.add("SunFlower");
		flower.add("Lilly");
		flower.add("Jasmine");
		flower.add("Lotus");
		System.out.println("Print the ArrayList:" +flower);
		int s=flower.size();
	    String[] a =new String[s];
	    //Convert list to array
	   flower.toArray(a);
	   System.out.println("Print the array:");
		for(String x:a)
		{
		System.out.println(x);
	}
	}
}
	
/* Output:
Print the ArrayList:[Rose, SunFlower, Lilly, Jasmine, Lotus]
Print the array:
Rose
SunFlower
Lilly
Jasmine
Lotus
*/
