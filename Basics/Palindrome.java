

//User function Template for Java

class Solution
{
    public String is_palindrome(int n)
    {
        // Code here
    int reverse =0 ,temp =n;
    while (temp>0){
        reverse=(reverse*10)+(temp%10);
        temp =temp/10;
    }
    return (reverse ==n? "Yes":"No");
    }
}

// `  public static void main(String args[])  
//   {  
//       String original, reverse = ""; // Objects of String class  
//       Scanner in = new Scanner(System.in);   
//       System.out.println("Enter a string/number to check if it is a palindrome");  
//       original = in.nextLine();   
//       int length = original.length();   
//       for ( int i = length - 1; i >= 0; i-- )  
//          reverse = reverse + original.charAt(i);  
//       if (original.equals(reverse))  
//          System.out.println("Entered string/number is a palindrome.");  
//       else  
//          System.out.println("Entered string/number isn't a palindrome.");   
//   }  

// STEP 1: START
// STEP 2: INITIALIZE arr[]= {1, 2, 3, 4, 2, 7, 8, 8, 3}.
// STEP 3: PRINT "Duplicate elements in given array:"
// STEP 4: REPEAT STEP 5 to STEP 7 for(i=0; i<arr.length; i++)
// STEP 5: REPEAT STEP 6 and STEP 7 for(j=i+1; j<arr.length; j++)
// STEP 6: if(arr[i] == arr[j])
// STEP 7: PRINT arr[j]
// STEP 8: END