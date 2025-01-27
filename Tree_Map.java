package Task7;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Tree_Map {
	
	public static <EmpId, EmpName extends Comparable<EmpName>> Map<EmpId, EmpName>
	
    sortByValues(final Map<EmpId, EmpName> map)
    {
		Comparator<EmpId> valueComparator = new Comparator<EmpId>() {
		public int compare(EmpId E1, EmpId E2)
		{
			int compare =map.get(E1).compareTo(map.get(E2));
			if(compare==0)
				return 1;
			else 
				return compare;
		}
		};
		
		Map<EmpId, EmpName> sortedByValues= new TreeMap<EmpId, EmpName>(valueComparator);
		sortedByValues.putAll(map);
		return sortedByValues;
		}
		
    
	public static void main(String[] args) {
		
		TreeMap<Integer, String> EmployeeDetails=new TreeMap<>();
		//Declare the Employee id and name
		EmployeeDetails.put(501, "Prasanth");
		EmployeeDetails.put(505, "Sowmiya");
		EmployeeDetails.put(503, "John");
		EmployeeDetails.put(510, "Christopher");
		EmployeeDetails.put(521, "Jahid");
		//In TreeMap Keys are printed as ascending order but the values are not
		System.out.println("Employee Details: " +EmployeeDetails);
		
		//Calling the method sortByValues
		Map sortedMap = sortByValues(EmployeeDetails);
		
		//Get a set of the entries on the sorted map
		Set set = sortedMap.entrySet();
		
		//Get an iterator
		Iterator i = set.iterator();
		System.out.println("Print Employees name in alphabetic order:");
		//Display elements
		while(i.hasNext()) {
			Map.Entry me=(Map.Entry)i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
			
		}
		
	}

}

/*Output:
 * Employee Details: {501=Prasanth, 503=John, 505=Sowmiya, 510=Christopher, 521=Jahid}
Print Employees name in alphabetic order:
510: Christopher
521: Jahid
503: John
501: Prasanth
505: Sowmiya
*/
