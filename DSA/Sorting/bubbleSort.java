// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
   int [] arr={400,13,6,8,3,200,2};
   int n=arr.length;
   for(int i=0;i<n;i++){
       boolean isSwapped =false;
       
       for(int j=0;j<n-1;j++){
           if(arr[j]>arr[j+1]){
               isSwapped = true;
               int temp = arr[j];
               arr[j]=arr[j+1];
               arr[j+1]= temp;
           }
           
       }
       if(!isSwapped){
           break;
       }
   }
   for(int i:arr){
       System.out.print(i+"  ");
   }
    }
}