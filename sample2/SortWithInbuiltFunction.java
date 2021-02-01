//sort with inbuilt function
package sample2;
import java.util.Arrays;

public class SortWithInbuiltFunction {

	public static void main(String[] args) {
	
		int[] numbers = {1,4,5,6,3,65,6,7};
		int[] sortedArray = sortWithInbuiltFunction(numbers);
                for(int i = 0;i<sortedArray.length;i++) {
                       System.out.print(sortedArray[i]+",");
                }
	}

	private static int[] sortWithInbuiltFunction(int[] numbers) {
	
		
		Arrays.sort(numbers);
		
		    	return numbers;
	}

}
