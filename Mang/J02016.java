import java.util.*;

public class J02016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long[] a = new long[n];
            HashSet<Long> set = new HashSet<>();

            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
                a[i] = x * x;
                set.add(a[i]);
            }

            boolean ok = false;

            for (int i = 0; i < n - 1 && !ok; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (set.contains(a[i] + a[j])) {
                        ok = true;
                        break;
                    }
                }
            }

            System.out.println(ok ? "YES" : "NO");
        }
        sc.close();
    }
}