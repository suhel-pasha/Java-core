public class ReverseArray {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		int[] reversed = reverseArray(numbers);
		

		for (int i = 0; i < reversed.length; i++) {
			System.out.print(reversed[i]+",");
		}

	}

	private static int[] reverseArray(int[] numbers) {
		int[] reverse = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			reverse[numbers.length-1-i]=numbers[i];
				
			}
	
		return reverse;
	}
}
