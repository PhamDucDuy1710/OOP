import java.util.*;

public class J03030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s == null || s.isEmpty()) return;
        int dpA = 0;
        int dpB = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int nextA, nextB;
            if (c == 'A') {
                nextA = Math.min(dpA, dpB + 1);
                nextB = Math.min(dpA, dpB) + 1;
            } else {
                nextA = Math.min(dpA, dpB) + 1;
                nextB = Math.min(dpB, dpA + 1);
            }
            dpA = nextA;
            dpB = nextB;
        }
        System.out.println(dpA);
        sc.close();
    }
}