import java.util.*;

public class J01020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int n = sc.nextInt();
            if(n == 0) {
                System.out.println("Impossible");
                continue;
            }
            long k = 0;
            int cnt = 0;
            boolean used[] = new boolean[10];
            while(cnt < 10) {
                k += n;
                long x = k;
                while(x > 0) {
                    int d = (int)(x % 10);
                    if(!used[d]) {
                        used[d] = true;
                        cnt++;
                    }
                    x /= 10;
                }
            }
            System.out.println(k);
        } 
        sc.close();
    }
}
