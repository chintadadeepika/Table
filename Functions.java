// Q  Using function tell whether a number is a prime number or not
// Q table of given
import java.util.*;

public class Functions {
    public static void noTable(int n){
         for (int i=1; i<=10; i++){
             int ans = n * i;
             System.out.println(n +"*" +i + "=" + ans);
         }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        noTable(n);
    }
}