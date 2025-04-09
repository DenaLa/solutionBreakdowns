class SecondLargest {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int ans = 0;
        int first = -1;
        int second = -1;
        
        for(int i = 0; i<arr.length;i++){
            if(arr[i] > first){
                second = first;
                first = arr[i];
            }
            else if(arr[i] < first && arr[i] > second){
                second = arr[i];
            }
        }
        
 
        ans = second;
        return second;
    }
}
