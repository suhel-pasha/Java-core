package sample;

import java.util.Scanner;

public class Avantika {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String inputString = scanner.nextLine();
		printOccurance(inputString);
		scanner.close();

	}

	private static void printOccurance(String inputString) {
		String result = "";
		
		for (int i = 0; i < inputString.length(); i++) {
			int count = 0;
			for (int j = 0; j < result.length(); j++) {
				if (inputString.charAt(i) == result.charAt(j)) {
					count++;
				}
			}
			if (count == 0) {
				result = result + inputString.charAt(i);
			}

		}
		System.out.println(result);

	}

}
