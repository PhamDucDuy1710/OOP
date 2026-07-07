import java.util.*;

public class J03013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            String a = sc.next();
            String b = sc.next();
            if (a.length() < b.length() || (a.length() == b.length() && a.compareTo(b) < 0)) {
                String tmp = a;
                a = b;
                b = tmp;
            }
            int len = Math.max(a.length(), b.length());
            while (a.length() < len) a = "0" + a;
            while(b.length() < len) {
                b = "0" + b;
            }
            String res = "";
            int nho = 0;
            for(int i = len - 1; i >= 0; i--) {
                int digit = a.charAt(i) - b.charAt(i) - nho;
                if(digit < 0) {
                    digit += 10;
                    nho = 1;
                }
                else {
                    nho = 0;
                }
                res = (char)(digit + '0') + res;
            }
            System.out.println(res);
        }
        sc.close();
    }
}
