import java.util.*;

public class J01009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int m = 0;
        while(t-- >0) {
            m++;
            int n = sc.nextInt();
            System.out.print("Test " + m + ": ");
            for(int i = 2; i * i <= n; i++) {
                int cnt = 0;
                while(n % i == 0) {
                    cnt++;
                    n /= i;
                }
                System.out.print(i + "(" + cnt + ") ");
            }
            if(n > 1) System.out.println(n + "(1)");
        }
        sc.close();
    }
}
