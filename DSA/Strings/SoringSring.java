import java.util.Arrays;
class Main {
    public static void main(String[] args) {

   
      String str ="cabed";
        
        char [] chars = str.toCharArray();
        Arrays.sort(chars);
        String sort = new String(chars);
        System.out.println(sort);
 }
}


