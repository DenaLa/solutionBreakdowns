class MinHeightsII{
    int getMinDiff(int[] arr, int k) {
        // code here
        int len = arr.length;
        Arrays.sort(arr);
        
        int ans = arr[len-1] - arr[0];
        
        for(int i = 1; i<len;i++){
            if(arr[i]-k < 0){
                continue;
            }
            
            int min = Math.min(arr[0] + k, arr[i] - k);
            
            int max = Math.max(arr[len-1] - k, arr[i-1] + k);
            
            ans = Math.min(ans, max-min);
        }
        
        return ans;
    }
}
