 import java.util.*;

public class J03035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            String a = sc.next();
            String b = sc.next();
            int n = a.length();
            int tmp[] = new int[n + 1];
            for(int i = n - 1; i >= 0; i--) {
                tmp[i] = tmp[i + 1] + (a.charAt(i) == '?' ? 1 : 0);
            }
            long ans = 0;
            for(int i = 0; i < n; i++) {
                char ca = a.charAt(i);
                char cb = b.charAt(i);
                if(ca == '?') {
                    int cnt = 9 - (cb - '0');
                    if(cnt > 0) {
                        ans += (long) cnt * (long) Math.pow(10, tmp[i + 1]);
                    }
                }
                else {
                    if(ca > cb) {
                        ans += (long) Math.pow(10, tmp[i + 1]);
                        break;
                    }
                    else if(ca < cb) {
                        break;
                    }
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
