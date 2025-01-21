import java.util.*;

public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 10;
        while(i > 0){
            System.out.print(i * n + " ");
            i--;
        }
    }
}