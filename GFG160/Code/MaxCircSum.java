class MaxCircSum{
	static int maxCircularSum(int [] arr){
		
		int totalSum = 0;
		int currentMaxSum = 0, currMinSum = 0;
		int maxSum = arr[0], minSum = arr[0];
		
		
		for(int i = 0; i < arr.length; i++){
			
			//Kadene's to find maximum sum subarray
			currMaxSum = Math.max(currMaxSum + arr[i], arr[i]);
			maxSum = Math.max(maxSum, currMaxSum);
			
			//Kadene's to find minimum sum subarray
			currMinSum = Math.min(currMinSum + arr[i], arr[i]);
			minSum = Math.min(minSum, currMinSum);
			
			/// Sum of all the elements of input array
			totalSum += arr[i];
		}
		
		int normalSum = maxSum;
		int circularSum = totalSum - minSum;
		
		//if the minimum subarray is equal to total sum, then we just need to return normalSum
		if(minSum == totalSum){
			return normalSum;
		}
		
		return Math.max(normalSum, circularSum);
		
	}
}
