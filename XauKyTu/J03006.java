import java.util.*;

public class J03006 {
    public static boolean check(String s) {
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int digit = s.charAt(i) - '0';

            if (digit % 2 != 0) return false;

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