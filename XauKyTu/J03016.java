import java.util.*;
// import java.math.BigInteger;

public class J03016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            String s = sc.next();
            int du = 0;
            for(int i = 0; i < s.length(); i++) {
                du = (du * 10 + (s.charAt(i) - '0')) % 11;
            }
            if(du == 0) {
                System.out.println(1);
            }
            else {
                System.out.println(0);
            }
        }
        sc.close();
    }
}
