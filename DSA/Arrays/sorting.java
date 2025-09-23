//* Arrays in Java
class Main {
    public static void main(String[] args) {
       int [] arr = {12,8,7,3,11};
       for(int i=0 ;i<arr.length; i++){
           System.out.println(arr[i]);
       }
       System.out.println("Reverse Array");
       
    }
}

//  *Reverse in Arrays 
class Main {
    public static void main(String[] args) {
       int [] arr = {12,8,7,3,11};
       for(int i=arr.length-1; i>=0;i--){
           System.out.println(arr[i]);
       }
       System.out.println("Reverse Array");
       
    
    
    }
}
//* Two Pointer Approach
class Main {
    public static void main(String[] args) {
       int [] arr = {12,8,7,3,11};
       // This for loop for printing original array
       for(int i=0;i<arr.length; i++){
           System.out.println(arr[i]);
       }
       reverse(arr,0,arr.length-1);
       System.out.println("Reverse Number");
       
    //    This For loop for swap or printing reverse array
        for(int i=0;i<arr.length; i++){
           System.out.println(arr[i]);
       }
    }
       
       private static void reverse(int[] arr, int start, int end){
            while(start<=end){
           int temp = arr[start];
           arr[start] =arr[end];
           arr[end] = temp;
           start++;
           end--;  
            }
    }
}


//* array Default values
class Main {
    public static void main(String[] args) {
       int[] arr = new int[5];
       boolean[] boolArr = new boolean[5];
       String [] str =new String[5];
    
    for(int i=0 ; i<5;i++){
        System.out.println("Array" +arr[i]);
        System.out.println("Array" +boolArr[i]);
        System.out.println("Array" + str[i]);
        // System.out.println("Array"arr[i]);
    }
}
}
// *Multi Dimensional Array
class Main{
    public static void main (String []args){
        int[] [] matrix ={
            {1,2,3},
            {7,88,55,2345},
            {9,8,3}
        };
        for(int row =0;row<matrix.length;row++){
            for(int  col=0; col<matrix[row].length;col++){
                System.out.print("" +  matrix[row][col]);
            }
            System.out.println();
        }

    }
}
//* String
class Main{
    public static void main (String []args){
        String [] names = new String []{
            "Alice",
            "Bob",
            "Charlie"
        };
        for(int ind=0; ind<names.length; index++){
            System.out.println(names[ind]);
        }
    }
}