package sample;

import java.util.Scanner;

public class Ruperto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int numOfElements = scanner.nextInt();
		System.out.println("Enter the elements into the array");
		int[] array = new int[numOfElements];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("Enter the key:");
		int key = scanner.nextInt();

		int[] result = findpair(array, key);
		if (result == null) {
			System.out.println("No pair add up to the key");
		} else {
			System.out.println("The Resultant Array is :");
			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i] + " ");
			}
		}
		scanner.close();
	}

	private static int[] findpair(int[] array, int key) {

		int[] result = new int[2];
		for (int i = 0; i < array.length; i++) {
			if (array[i] + array[i + 1] == key) {
				result[0] = array[i];
				result[1] = array[i + 1];
				return result;
			}
		}

		return null;

	}

}
