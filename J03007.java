import java.util.*;

public class J03007 {
    public static boolean check(String s) {
        char c = s.charAt(s.length() - 1);
        if(c != '8') return false;  
        int sum = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int digit = s.charAt(i) - '0';
            sum += digit;

            if (s.charAt(i) != s.charAt(n - 1 - i))
                return false;
        }
        if(sum % 10 != 0) return false;
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