import java.util.*;

public class J01018{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-- >0) {
                String s = sc.next();
                char c[] = s.toCharArray();
                boolean ok = true;
                int ans = c[0] - '0';
                for(int i = 1; i < s.length(); i++) {
                    ans += c[i] - '0';
                    int x = c[i] - '0';
                    int y = c[i-1] - '0';
                    if(Math.abs(x - y) != 2) {
                        ok = false;
                        break;
                    } 
                }
                if(ok && ans % 10 == 0) {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
            sc.close();
        }
}
