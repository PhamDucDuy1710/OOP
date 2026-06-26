import java.util.*;

public class J02025 {
    static int n;
    static int[] a = new int[20];
    static int[] X = new int[20];
    static ArrayList<ArrayList<Integer>> res = new ArrayList<>();

    static boolean nt(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static void result(int m) {
        ArrayList<Integer> t = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            t.add(X[i]);
        }
        res.add(t);
    }

    static void Try(int i, int idx, int sum) {
        for (int j = idx + 1; j <= n; j++) {
            X[i] = a[j];
            int newSum = sum + a[j];

            if (nt(newSum)) {
                result(i);
            }

            Try(i + 1, j, newSum);
        }
    }

    static void solve(Scanner sc) {
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        Integer[] temp = new Integer[n];
        for (int i = 0; i < n; i++) {
            temp[i] = a[i + 1];
        }

        Arrays.sort(temp, Collections.reverseOrder());

        for (int i = 1; i <= n; i++) {
            a[i] = temp[i - 1];
        }

        res.clear();
        Try(1, 0, 0);

        Collections.sort(res, (x, y) -> {
            int len = Math.min(x.size(), y.size());

            for (int i = 0; i < len; i++) {
                if (!x.get(i).equals(y.get(i))) {
                    return x.get(i) - y.get(i);
                }
            }
            return x.size() - y.size();
        });

        for (ArrayList<Integer> v : res) {
            for (int x : v) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }
}