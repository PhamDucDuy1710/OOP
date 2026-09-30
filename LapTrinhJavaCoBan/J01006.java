import java.util.*;

public class J01006 {
    public static long fibo(int n) {
        long F[] = new long[100];
        F[0] = 0; F[1] = 1;
        for(int i = 2; i <= 92; i++) {
            F[i] = F[i-1] + F[i-2];
        }
        return F[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            System.out.println(fibo(n));
        }
        sc.close();
    }
}
