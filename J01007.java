import java.util.*;

public class J01007 {
    public static boolean fibo(long n) {
        long F[] = new long[100];
        F[0] = 0; F[1] = 1;
        for(int i = 2; i <= 92; i++) {
            F[i] = F[i-1] + F[i-2];
        }
        for(int i = 0; i <= 92; i++) {
            if(n == F[i]) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            if(fibo(n)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
