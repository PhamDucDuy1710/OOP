import java.util.*;

public class J03021 {
    public static char convert(char c) {
        c = Character.toUpperCase(c);
        if (c >= 'A' && c <= 'C') return '2';
        if (c >= 'D' && c <= 'F') return '3';
        if (c >= 'G' && c <= 'I') return '4';
        if (c >= 'J' && c <= 'L') return '5';
        if (c >= 'M' && c <= 'O') return '6';
        if (c >= 'P' && c <= 'S') return '7';
        if (c >= 'T' && c <= 'V') return '8';
        return '9'; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            String s = sc.next();
            StringBuilder num = new StringBuilder();

            for(int i = 0; i < s.length(); i++) {   
                num.append(convert(s.charAt(i)));
            }
            boolean ok = true;
            for(int i = 0; i < num.length(); i++) {
                if(num.charAt(i) != num.charAt(num.length() - 1 - i)) {
                    ok = false;
                    break;
                }
            }
            System.out.println(ok ? "YES" : "NO");
        }
        sc.close();
    }
}
