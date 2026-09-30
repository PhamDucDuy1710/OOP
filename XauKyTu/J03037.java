import java.util.*;
import java.io.*;

public class J03037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] l = new int[26];
        int[] r = new int[26];
        Arrays.fill(l, -1);

        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'A';
            if (l[c] == -1) l[c] = i;
            else r[c] = i;
        }

        int cnt = 0;
        for (int a = 0; a < 26; a++) {
            for (int b = a + 1; b < 26; b++) {
                int l1 = l[a], r1 = r[a], l2 = l[b], r2 = r[b];
                if (l1 > l2) {
                    int t;
                    t = l1; l1 = l2; l2 = t;
                    t = r1; r1 = r2; r2 = t;
                }
                if (l2 < r1 && r1 < r2) cnt++;
            }
        }
        System.out.println(cnt);
    }
}