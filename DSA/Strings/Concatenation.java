class Main {
    public static void main(String[] args) {

   
        String str1 ="Praveen";
        String str2 = "Pravin";
        
        System.out.println(str1+ " "+str2);
        
        StringBuilder   resultWithoutPlus = new StringBuilder();
        resultWithoutPlus.append(str1).append(" ").append(str2);
        System.out.println(resultWithoutPlus.toString());
    }
   
} 


