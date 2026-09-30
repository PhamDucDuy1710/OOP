import java.util.*;
public class J03012 {
    public static String Sum(String a, String b) {
        int len = Math.max(a.length(), b.length());
        while(a.length() < len) {
            a = "0" + a;
        }
        while(b.length() < len) {
            b = "0" + b;
        }
        String res = "";
        int nho = 0;
        for(int i = len - 1; i >= 0; i--) {
            int digit = (a.charAt(i) - '0') + (b.charAt(i) - '0') + nho;
            nho = digit / 10;
            res = (char)(digit % 10 + '0') + res;
        }
        if(nho > 0) {
            res = (char)(nho + '0') + res;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            String a = sc.next();
            String b = sc.next();
            System.out.println(Sum(a,b));
        } 
        sc.close();
    }
}
