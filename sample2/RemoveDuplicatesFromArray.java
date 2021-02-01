package sample2;


public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 1, 4, 5 };
		int[] result = removeDuplicates(numbers);

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + ",");
		}

	}

	private static int[] removeDuplicates(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i; j < numbers.length - 1; j++) {
				if (numbers[i] == numbers[j + 1])
					numbers = remove(numbers, j + 1);
			}

		}

		return numbers;
	}

	private static int[] remove(int[] numbers, int r) {
		int[] copy = numbers;
		int k = 0;
		int m = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (i == r) {
				m++;
			} else {
				numbers[k] = copy[i];
				k++;
			}
		}
		int[] res = new int[numbers.length - m];
		for (int i = 0; i < res.length; i++) {
			res[i] = numbers[i];
		}
		return res;
	}
}
