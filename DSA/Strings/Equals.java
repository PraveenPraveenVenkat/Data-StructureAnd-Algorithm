class Main {
    public static void main(String[] args) {

        //* in Equals method 
        // String str ="Praveen";
        // String str1 = "Praveen";
           String s1 = new String("abc");
        String s2 = new String("abc");
        // StringBuilder sb = new StringBuilder();
    //    System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

    }
}


      //* Not Equals method , Use Loop and Condition
class Main {
    public static void main(String[] args) {

   
        String str1 ="Praveen";
        String str2 = "Pravin";
        
        System.out.println(isSame(str1, str2));
    }
    private static boolean isSame(String s1,String s2){
     int n =s1.length();
     int m =s2.length();
     if(n!=m){
         return false;
     }
     for(int i=0; i<n; i++){
         if(s1.charAt(i) != s2.charAt(i)) {
             return false;
         }
     }
     return true;
    }
} 


