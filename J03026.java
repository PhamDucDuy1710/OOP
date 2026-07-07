import java.util.*;

public class J03026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        while(m-- >0) {
            String s = sc.next();
            String t = sc.next();
            int ans = -1;
            for(int i = 0; i < s.length(); i++) {
                for(int j = i + 1; j <= s.length(); j++) {
                    String tmp = s.substring(i,j);
                    if(!t.contains(tmp)) {
                        ans = Math.max(ans, tmp.length());
                    }
                }
            }
            for(int i = 0; i < t.length(); i++) {
                for(int j = i + 1; j <= t.length(); j++) {
                    String tmp = t.substring(i,j);
                    if(!s.contains(tmp)) {
                        ans = Math.max(ans, tmp.length());
                    }
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
