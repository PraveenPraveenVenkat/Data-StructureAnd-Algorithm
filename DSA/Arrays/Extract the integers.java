// User function Template for Java
class Solution {
    ArrayList<String> extractIntegerWords(String s) {
        // code here
        // int n =s.length;
        //  extractIntegerWords()
        // if(s==0){
        //     return "No Integers";
        //     for(int i=0;i<s.length; i++){
        //         System.out.println(s[i]);
        //     }
        // }
         ArrayList<String> result = new  ArrayList<>();
         StringBuilder num = new StringBuilder();
         
         for(char ch: s.toCharArray() ){
             if(Character.isDigit(ch)){
                 num.append(ch);
             }else{
                 if(num.length()>0){
                     result.add(num.toString());
                     num.setLength(0);
                 }
             }
         }
        if(num.length()>0){
             result.add(num.toString()); 
        }
        //* Used Collections to return "No Integer" if result is empty
        // return result.isEmpty() ? List.of("No Integer") :result;
        // return result.isEmpty() ? ArrayList.of("No Integer") :result;
        // return result.isEmpty() ? Collection.SingleList("No Integer") :result;
       if(result.isEmpty()){
           result.add("No Integers");
       }
       return result;
    }
}