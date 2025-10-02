
// Inbuild Method to reverse a string
class Main {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        String str ="Praveen";
        String sb = new StringBuilder(str).reverse().toString();
        System.out.println(sb);
    }
}


// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {

        //* Using Loop
        String str ="Praveen";
         String reverse ="";
        for(int i=str.length()-1;i>=0;i--){
            reverse += str.charAt(i);  //!  Avoid + operator in production 
        }
        System.out.println(reverse);

    }
}

class Main {
    public static void main(String[] args) {

        //* String Builder
        String str ="Praveen";
        StringBuilder sb = new StringBuilder();
       
        for(int i=str.length()-1;i>=0;i--){
                sb.append(str.charAt(i));   //!  Avoid + operator in production 
        }
        System.out.println(sb.toString());

    }
}