import java.util.*;

public class J01022 {
    static long f[] = new long[93];
    public static char cale(int n, long k) {
        if(n == 1) return '0';
        if(n == 2) return '1';
        if(k <= f[n-2]) {
            return cale(n-2,k);
        }
        else {
            return cale(n-1,k - f[n-2]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        f[1] = 1;
        f[2] = 1;
        for(int i = 3; i < 93; i++) {
            f[i] = f[i-1] + f[i-2];
        }
        int t = sc.nextInt();
        while(t-- >0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(cale(n,k));
        }  
        sc.close();
    }
}
