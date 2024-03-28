import java.util.Arrays;

public class TwoSumSolution {
	
	public static int[] twoSumPointers(int[] numbers, int target) {		
		int leftPointer = 0;
		int rightPointer = numbers.length-1;
		
		while(leftPointer < rightPointer) {
			System.out.println(numbers[leftPointer]+" "+ numbers[rightPointer]);
			int currentSum = numbers[leftPointer] + numbers[rightPointer];
			if( currentSum == target) {
				int[] solution = new int[2];
				solution[0] = leftPointer;
				solution[1] = rightPointer;
				return solution;
			}else if(currentSum< target) {
				leftPointer++;
			}else {
				rightPointer--;
			}
		}
		
		int[] noAnswer = {-1,-1};
		return noAnswer;	
	}

	public static void main(String[] args) {
		int[] testNumbers = {-4, 4, 5, 7, 9, 10, 19, 21};
		System.out.println(Arrays.toString(twoSumPointers(testNumbers, 16)));

	}

}
