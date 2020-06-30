package sef.module9.sample;
//Needs to be completed
import java.util.*;

public class SetSample {
	public static void main(String[] args) {
		//1 - Create a new HashSet and name it monthSet
		Set monthset = new HashSet();
		monthset.add("JAN");
		monthset.add("JAN");
		monthset.add("FEB");// can exist once in a set
		monthset.add("MAR");//ordering unit, in set type collection. Ordered list.
		
		//System.out.println(monthset.add("January"));
		//2 - Add duplicate month names in it. For eg. January can be entered twice
		//duplicates will return false
		//System.out.println(monthSet.add("January"));

		print(monthset);
		//3 - Iterate through the HashSet and print all the months.
		
	}
		//You'd notice that duplicate names are not printed.
		static void print (Set set){
			Iterator i = set.iterator();
				while(i.hasNext()){
					System.out.println(i.next());
				}
			}
		
	}

