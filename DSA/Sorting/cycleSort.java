class Main {
    public static void main(String[] args) {
        // int [] nums = {400,13,6,8,3,200,2};
         int[] nums = {3, 5, 2, 1, 4};
       int i=0;
       while(i<nums.length){
           int current =nums[i]-1;
           if(nums[i] != nums[current]){
               int temp =nums[i];
               nums[i]=nums[current];
               nums[current]=temp;
           }else{
               i++;
           }
       }
       for(int num:nums) System.out.print(num);
      
    }
}

