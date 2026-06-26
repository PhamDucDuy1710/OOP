import java.util.*;

public class J01017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            String s = sc.next();
            char c[] = s.toCharArray();
            boolean ok = true;
            for(int i = 1; i < s.length(); i++) {
                int x = c[i] - '0';
                int y = c[i-1] - '0';
                if(Math.abs(x - y) != 1) {
                    ok = false;
                    break;
                } 
            }
            if(ok) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
