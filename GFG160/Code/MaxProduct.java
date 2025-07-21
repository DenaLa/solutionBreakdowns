class MaxProduct{
	
	static int maxProduct(int[] arr){
		
		int n = arr.length;
		int maxProd = Integer = Integer.MIN_VALUE;
		
		//fromLeft to store product from left to right
		int fromLeft = 1;
		
		//fromRight to store product from right to left
		int fromRight = 1;
		
		for(int i = 0; i<n; i++){
			
			//Represents running into a 0 and starting a new array
			if(fromLeft ==0){
				fromLeft =1;
			}
			if(fromRight ==0){
				fromRight = 1;
			}
			
			//calculate product from index left to right
			fromLeft *= arr[i];
			
			//calculate product from index right to left
			int j = n - i - 1;
			fromRight *= arr[j];
			maxProd = Math.max(fromLeft, Math.max(fromRight,maxProd));
		}
		
		return maxProd;
	}
}
