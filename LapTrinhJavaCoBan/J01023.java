import java.util.*;

public class J01023 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder s;
    static char op[] = {'+', '-'};
    static boolean ok;
    static boolean check() {
        int a = (s.charAt(0) - '0') * 10  + (s.charAt(1) - '0');
        int b = (s.charAt(5) - '0') * 10  + (s.charAt(6) - '0');
        int c = (s.charAt(10) - '0') * 10  + (s.charAt(11) - '0');
        if(a < 10 || b < 10 || c < 10) {
            return false;
        }
        if(s.charAt(3) == '+') {
            return a + b == c;
        }
        else {
            return a - b == c;
        }
    }

    static void Try(int i) {
        if(ok) return;
        if(i == s.length()) {
            if(check()) {
                ok = true;
                System.out.println(s);
            }
            return;
        }
        if(s.charAt(i) == '?') {
            if(i == 3) {
                for(int j = 0; j <= 1; j++) {
                    s.setCharAt(i, op[j]);
                    Try(i + 1);
                }
            }
            else {
                for(int j = 0; j <= 9; j++) {
                    s.setCharAt(i, (char) (j + '0'));
                    Try(i + 1);
                }
            }
            s.setCharAt(i, '?');
        }
        else {
            Try(i + 1);
        }
    }
    static void solve() {
        ok = false;
        s = new StringBuilder(sc.nextLine());
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '*' || s.charAt(i) == '/') {
                System.out.println("WRONG PROBLEM!");
                return;
            }
        }
        Try(0);
        if(!ok) System.out.println("WRONG PROBLEM!");
    }
    public static void main(String args[]) {
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0) {
            solve();
        }
    }
}
