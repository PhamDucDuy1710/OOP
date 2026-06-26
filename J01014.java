import java.util.*;

public class J01014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int mx = 0;
            int n = sc.nextInt();
            for(int i = 2; i * i <= n; i++) {
                if(n % i == 0) {
                    mx = Math.max(mx,i);
                    while(n % i == 0) {
                        n /= i;
                    }
                }
            }
            if(n > 1) mx = Math.max(mx,n);
            System.out.println(mx);
        }
        sc.close();
    }
}
