import java.util.*;

public class J01008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int n = sc.nextInt();
            for(int i = 2; i * i <= n ;i++) {
                int cnt = 0;
                if(n % i == 0) {
                    while(n % i == 0) {
                        cnt++;
                        n /= i;
                    }
                    System.out.print(i + "(" + cnt + ")" + " ");
                }
            }
            if(n > 1) System.out.println(n + "(1)");
            System.out.println();
        }
        sc.close();
    }
}
