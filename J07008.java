import java.util.*;

public class J07008 {
    static int n;
    static int[] a = new int[1005];
    static int[] X = new int[1005];
    static ArrayList<String> v = new ArrayList<>();

    static void result(int m) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= m; i++) {
            sb.append(X[i]).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        v.add(sb.toString());
    }

    static void Try(int i, int idx) {
        for (int j = idx + 1; j <= n; j++) {
            if (i == 1 || a[j] > X[i - 1]) {
                X[i] = a[j];
                if (i >= 2) result(i);
                Try(i + 1, j);
            }
        }
    }

    static void solve(Scanner sc) {
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        v.clear();
        Try(1, 0);

        Collections.sort(v);

        for (String s : v) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
}