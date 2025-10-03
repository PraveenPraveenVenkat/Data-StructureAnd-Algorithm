

class Main {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        String source ="Praveen";
        char target = 'e';
        
        int count =0;
        for(int i=0;i<source.length();i++){
            if(source.charAt(i)== target){
                count ++;
            }
            
        }
        System.out.println(count);
    }
}