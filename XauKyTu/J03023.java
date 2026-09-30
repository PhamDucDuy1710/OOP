import java.util.*; 
import java.io.*;

public class J03023 {
    static int val(char c) {
        if(c == 'I') return 1;
        if(c == 'V') return 5;
        if(c == 'X') return 10;
        if(c == 'L') return 50;
        if(c == 'C') return 100;
        if(c == 'D') return 500;
        if(c == 'M') return 1000;
        return 0;
    }
    static int solve(String s) {
        int res = 0;
        int n = s.length();
        for(int i = 0; i < n; i++) {
            int tmp = val(s.charAt(i));
            if(i + 1 < n && tmp < val(s.charAt(i+1))) {
                res -= tmp;
            }
            else {
                res += tmp;
            }
        }
        return res;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            String s = sc.next();
            System.out.println(solve(s));
        }
    }
}