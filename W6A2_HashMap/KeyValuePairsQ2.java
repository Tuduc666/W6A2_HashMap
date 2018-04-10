/*
 * 2. Printing out one-by-one again
Using the HashMap from part 1, print out each key,value pair one by one.
Try it with an iterator and then with a For-Each loop.

 */
package W6A2_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class KeyValuePairsQ2 {

	public static void main(String[] args) {
		Map<Integer,String> colors = new HashMap<Integer,String>();
		colors.put(1, "red");
		colors.put(2, "blue");
		colors.put(3, "green");
		colors.put(4, "yellow");
		colors.put(5, "white");
		
		// with an iterator
		System.out.println("Using an iterator...");
		Iterator<Map.Entry<Integer, String>> icolors = colors.entrySet().iterator();
		while (icolors.hasNext()) {
		    Map.Entry<Integer, String> entry = icolors.next();
		    System.out.println("[" + entry.getKey() + "] " + entry.getValue());
		}
		
		// for-each loop
		System.out.println("\r\nUsing a for-each loop...");
		for(Map.Entry<Integer,String> entry : colors.entrySet()) {
			System.out.println("[" + entry.getKey() + "] " + entry.getValue());
		}
	}
}
