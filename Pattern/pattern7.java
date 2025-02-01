class Main {
//   static void pattern7(int N)
   public static void main(String[] args)
{
    // This is the outer loop which will loop for the rows.
    for (int i = 0; i < 5; i++)
    { // For printing the spaces before stars in each row
        for (int j =0; j<5-i-1; j++)
        {
            System.out.print(" ");
        }  // For printing the stars in each row
        for(int j=0;j< 2*i+1;j++){
            System.out.print("*");
        }// For printing the spaces after the stars in each row
         for (int j =0; j<5-i-1; j++)
        {
            System.out.print(" ");
        }
        System.out.println();
    }
}
}