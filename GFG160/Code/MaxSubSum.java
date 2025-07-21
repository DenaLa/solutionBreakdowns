import java.util.Arrays;

//Find the subarray (has at least 1 element) that has the largest possible sum, and return that sum.

class MaxSubSum{
	
	static int maxSubarraySum(int[] arr){
		//max sum found so far
		int result = arr[0];
		
		//Sum of the numbers of the current sub array we are checking.
		int currentSum = arr[0];
		
		for(int i = 1; i < arr.length; i++){
			//if currentSum is positive, extend. If currentSum is negative, start a new array at the current element.
			
			currentSum = Math.max((currentSum + arr[i]),arr[i]);
			
			//Update the result. If currentSum is larger, make it the new sum.
			result = Math.max(result, currentSum);
			
		}
		
		return result;
	
	}
	
}
