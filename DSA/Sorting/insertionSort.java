class Main {
    public static void main(String[] args) {
        int [] arr = {400,13,6,8,3,200,2};
        int n = arr.length;
        
        for(int i =0; i < n; i++){
            int key = arr[i];
            int j = i - 1;
            
            // Move elements greater than key one position ahead
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            //* Putting key at its correct position 
            arr[j + 1] = key;
        }
        
        // Print sorted array
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}

