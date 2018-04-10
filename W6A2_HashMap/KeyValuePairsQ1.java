/*
 * 1. Key,Value Pairs
Create a new HashMap consisting of an Integer Key and String value.
Add 5 colors to the HashMap as values. The Keys should be numbers from 1-5.

Print out all Keys in the HashMap.
Print out all Values in the HashMap.

Try setting the value of one of the keys to something new.
Print out all keys again.
Print out all values again.

Did anything change? Why?

 */
package W6A2_HashMap;

import java.util.HashMap;
import java.util.Map;

public class KeyValuePairsQ1 {

	public static void main(String[] args) {
		Map<Integer,String> colors = new HashMap<Integer,String>();
		colors.put(1, "red");
		colors.put(2, "blue");
		colors.put(3, "green");
		colors.put(4, "yellow");
		colors.put(5, "white");
		
		System.out.println(colors.keySet());
		System.out.println(colors.values());
		
		colors.put(2, "orange");
		
		System.out.println(colors.keySet());
		System.out.println(colors.values());
		System.out.println("\r\nYes. key[2] changed.  The reason is because key has to be unique.  \r\n"
				+ "Since key[2] already exists, the system just replaced the value of key[2] \r\n"
				+ "instead of adding in a new entry.");

	}

}
