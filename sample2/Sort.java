package sample2;

public class Sort {

	public static void main(String[] args) {
	
		int[] numbers = {17,2,6,4,7,6,9,8,-90};
		int[] sortedArray = sortWithoutInbuiltFunction(numbers);
                for(int i = 0;i<sortedArray.length;i++) {
                       System.out.print(sortedArray[i]+",");
                }
	}

	private static int[] sortWithoutInbuiltFunction(int[] numbers) {
		int temp=0;
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if(numbers[i]>numbers[j]) {
					temp=numbers[i];
					numbers[i]=numbers[j];
					numbers[j] = temp;
				}
				
			}
		}
		return numbers;
	}

}
