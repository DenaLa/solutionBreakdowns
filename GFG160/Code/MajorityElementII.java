class MajorityElementII {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        int len = nums.length;
        int candA = -1;
        int candB = -1;
        int countA = 0;
        int countB = 0;
        List<Integer> result = new ArrayList<>();
        
        //data collection phase
        for(int ele : nums){
            //If element equals a candidate, increase the count
            if(ele == candA){
                countA++;
            }
            else if(ele == candB){
                countB++;
            }
            
            //if counts are 0, replace
            if(countA == 0){
                candA = ele;
                countA++;
            }
            else if(countB == 0){
                candB = ele;
                countB++;
            }
            
            //if current element is neither candidate, then decrease counts by 1
            if(ele != candA && ele != candB){
                countA --;
                countB --;
            }
            
            
        }//for loop
        
        //candidate eligibility phase
        countA = 0;
        countB = 0;
    
        //reporting the counts of our selected candidates
        for(int ele : nums){
            if(candA == ele){
                countA++;
            }
            if(candB == ele){
                countB++;
            }
        }//for loop
        
        //Putting our candidates into the result array list if they're eligible.
        if(countA > (len/3)){
            result.add(candA);
        }
        if(countB > (len/3) && candA != candB){
            result.add(candB);
        }
        
        
        //Reordering the array if it's not sorted
        if(result.size() == 2 && result.get(0) > result.get(1)){
            int temp = result.get(0);
            result.set(0, result.get(1));
            result.set(1, temp);
        }
        
        return result;
        
    }//method

}//class
