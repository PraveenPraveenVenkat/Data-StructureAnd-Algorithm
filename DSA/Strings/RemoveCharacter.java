class Main {
    public static void main(String[] args) {
        String str ="Praveen";
        char unwanted = 'e';
        
        //With using Inbuild metod using .replace
        // String resultInbuildMethod =  str.replace(String.valueOf(unwanted),"");
        //  System.out.println("After removing '"+unwanted+ " '(Using inbuild nethod):"+ resultInbuildMethod );
         
         //Without Inbuild metod using Loop
         StringBuilder resultWithbuildMethod = new  StringBuilder();
         for(int i=0;i< str.length(); i++){
             if(str.charAt(i) != unwanted){
                 resultWithbuildMethod.append(str.charAt(i));
             }
         }
          System.out.println("After removing '"+unwanted+ " '(Using Without inbuild Method):"+ resultWithbuildMethod.toString() );
       
    }
}

