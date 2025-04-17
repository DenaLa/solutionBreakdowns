class NextPermu {
    void nextPermutation(int[] arr) {
        // code here
        int pivot = -1; //the index that we pivot from
        int successor = -1; //the index of the successor
        
        for(int i = 0; i <arr.length-1; i++){
            if(arr[i] < arr[i+1]){
                pivot = i;
            }
        }
        
        if(pivot == -1){
            reverse(arr,0);
            return;
        }
        
        
        for(int i = pivot; i<arr.length;i++){
            if(arr[i] > arr[pivot]){
                successor = i;
            }
        }
        
        
        int temp = arr[pivot];
        arr[pivot] = arr[successor];
        arr[successor] = temp;
        
        reverse(arr,(pivot+1));
        
        
    }
    
    
    void reverse(int[] arr, int start){
        int end = arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
    }
}
