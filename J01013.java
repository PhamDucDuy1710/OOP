import java.util.*;

public class J01013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long sum = 0;
        while(t-- >0) {
            int n = sc.nextInt();
            for(int i = 2; i * i <= n; i++) {
                int cnt = 0;
                while(n % i == 0) {
                    cnt++;
                    n /= i;
                }
                sum += cnt*i;
            }
            if(n > 1) sum += n;
        } 
        System.out.println(sum);
        sc.close();
    }
}
