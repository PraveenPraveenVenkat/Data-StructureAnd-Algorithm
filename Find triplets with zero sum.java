//{ Driver Code Starts
import java.util.*;
class Triplets{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Solution g=new Solution();
			if(g.findTriplets(a,n))
				System.out.println("1");
			else
				System.out.println("0");
			
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/


class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        
         if(nums.length < 3)  return false;
 
            Arrays.sort(nums);
 
         for(int i =0; i < nums.length - 2; i++){
             int left = i+1;
             int right = nums.length - 1;
 
             while(left < right){
                 int sum = nums[i]+nums[left]+nums[right];
                 if(sum == 0){
                      return true;
                 }else if(sum < 0){
                     left++;
                 }else{
                     right--;
                 }
             }
         
    }
    //{ Driver Code Starts
import java.util.*;
class Triplets{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Solution g=new Solution();
			if(g.findTriplets(a,n))
				System.out.println("1");
			else
				System.out.println("0");
			
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/


class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        
         if(nums.length < 3)  return false;
 
            Arrays.sort(nums);
 
         for(int i =0; i < nums.length - 2; i++){
             int left = i+1;
             int right = nums.length - 1;
 
             while(left < right){
                 int sum = nums[i]+nums[left]+nums[right];
                 if(sum == 0){
                      return true;
                 }else if(sum < 0){
                     left++;
                 }else{
                     right--;
                 }
             }
         }
          return false;


}