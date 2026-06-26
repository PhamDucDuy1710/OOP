import java.util.*;

public class J03008 {
    public static boolean nt(int n) {
        if(n < 2) return false;
        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    public static boolean check(String s) {
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int digit = s.charAt(i) - '0';
            if(!nt(digit)) return false;

            if (s.charAt(i) != s.charAt(n - 1 - i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            if (check(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}