import java.util.*;

public class J03025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            int cnt = 0;
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                    cnt++;
            }
            if (s.length() % 2 == 0) {
                System.out.println(cnt == 1 ? "YES" : "NO");
            } else {
                System.out.println((cnt == 0 || cnt == 1) ? "YES" : "NO");
            }
        }
        sc.close();
    }
} 
    
