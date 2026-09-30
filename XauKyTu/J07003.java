import java.util.*;
import java.io.*;
import java.math.*;

public class J07003 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = sc.next();
        while(s.length() > 1) {
            int n = s.length();
            int mid = n / 2;
            BigInteger a = new BigInteger(s.substring(0, mid));
            BigInteger b = new BigInteger(s.substring(mid));
            s = a.add(b).toString();
            System.out.println(s);
        }
    }
}
