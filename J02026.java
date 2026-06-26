import java.util.*;

public class J02026 {
    static int n, k;
    static int[] a = new int[105];
    static int[] b = new int[105];

    static void result() {
        for (int i = 1; i <= k; i++) {
            System.out.print(b[a[i]] + " ");
        }
        System.out.println();
    }

    static void Try(int m) {
        for (int i = a[m - 1] + 1; i <= n - k + m; i++) {
            a[m] = i;

            if (m == k) {
                result();
            } else {
                Try(m + 1);
            }
        }
    }

    static void solve(Scanner sc) {
        n = sc.nextInt();
        k = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            b[i] = sc.nextInt();
        }

        Arrays.sort(b, 1, n + 1);

        a[0] = 0;
        Try(1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }
}