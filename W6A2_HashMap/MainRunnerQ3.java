package W6A2_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainRunnerQ3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// initialize the menu
		Map<String, MenuQ3> cart = new HashMap<String, MenuQ3>();
		cart.put("Hamburgers", new MenuQ3("Hamburgers"));
		cart.put("Hot Dogs", new MenuQ3("Hot Dogs"));
		cart.put("Sandwiches", new MenuQ3("Sandwiches"));
		cart.put("Soda", new MenuQ3("Soda"));
		cart.put("Fries", new MenuQ3("Fries"));

		while (true) {
			printCart(cart);

			System.out.println("Add an item to cart (Y/N)");
			String input = sc.nextLine();
			if (input.equals("N")) {
				System.out.println("Goodbye!");
				break;
			}

			System.out.println("What item would you like to add to your cart?");
			input = sc.nextLine();
			if (!cart.containsKey(input)) {
				System.out.println("Invalid item entered.");
				continue;
			}

			MenuQ3 item = cart.get(input); // returns the value of key, where key = input
			System.out.println("What quantity would you like to add?");
			int quantity = Integer.parseInt(sc.nextLine());
			item.addQty(quantity);
			cart.put(input, item);
			continue;
		}
		
		System.out.println("Your cart:");
		printCart(cart);
	}


	// print current items in your cart
	public static void printCart(Map<String, MenuQ3> cart) {
		for (MenuQ3 menu : cart.values()) {
			System.out.println(menu.getItem() + " - Current Quantity: " + menu.getQty());
			System.out.println();
		}
	}

}
