package collection.tasks.no3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class FoodItems {

	public static void main(String[] args) {

		Collection<String> fooditems = new ArrayList<String>();

		String item1 = "Ice Cream";
		String item2 = "Cake";
		String item3 = "Bread";
		String item4 = "Buiscuits";
		String item5 = "Pulao";

		fooditems.add(item1);
		fooditems.add(item2);
		fooditems.add(item3);
		fooditems.add(item4);
		fooditems.add(item5);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Select an item");
		System.out.println("1)Icecream");
		System.out.println("2)Cake");
		System.out.println("3)Bread");
		System.out.println("4)Buiscuits");
		System.out.println("5)Pulao");
		int n = scanner.nextInt();

		switch (n) {
		case 1:
            System.out.println("Selected item");
			System.out.println(item1);

			break;
		case 2:
			System.out.println("Selected item");
			System.out.println(item2);

			break;

		case 3:
			System.out.println("Selected item");
			System.out.println(item3);

			break;

		case 4:
			System.out.println("Selected item");
			System.out.println(item4);

			break;

		case 5:
			System.out.println("Selected item");
			System.out.println(item5);

			break;

		default:
			System.out.println("Invalid");
			break;
		}

		scanner.close();

	}

}
