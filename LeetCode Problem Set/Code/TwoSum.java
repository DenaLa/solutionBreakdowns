class TwoSum{
	public int[] twoSum(int[] nums,int target){
		//create hashmap
		HashMap<Integer,Integer> elements = new HashMap<>();
		
		//loop to place elements into a hashmap
		for(int i = 0; i < nums.length; i++){
			
			//check to see if complement exists in hash map
			int complement = target - nums[i];
			
			//if complement exists in hash, return an array of the complement
			if(elements.containsKey(complement)){
				return new int[]{elements.get(complement), i};
			}
			
			//placing elements in hash map
			elements.put(nums[1],i);
		
		}
		//return nothing if here is no complement
		return new int[] {};
	}
}
