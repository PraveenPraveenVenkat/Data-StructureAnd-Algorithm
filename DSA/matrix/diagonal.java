class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int [] [] matrix={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
//! Without Looping for two times
        //   for(int i=0;i<matrix.length;i++){
        //       System.out.print(matrix[i][matrix.length -1 -i]+ " ");
        // }
        for(int row =0;row<matrix.length;row++){
            for(int col=0;col<matrix[row].length;col++){
                //!Primary
            // if(row==col){
            //      System.out.print(matrix[col][row]+ " "); 
            // }
            //!Secondary
            if(row+col == matrix.length-1){
                 System.out.print(matrix[col][row]+ " ");
            }
            }
           System.out.println();
        }
        }
}