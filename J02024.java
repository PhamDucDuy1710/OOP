import java.util.*;

public class J02024 {
    static int n;
    static int[] a = new int[20];
    static int[] X = new int[20];
    static ArrayList<ArrayList<Integer>> res = new ArrayList<>();

    static void save(int m) {
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

            if (newSum % 2 == 1) {
                save(i);
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

        Collections.sort(res, (v1, v2) -> {
            int len = Math.min(v1.size(), v2.size());

            for (int i = 0; i < len; i++) {
                if (!v1.get(i).equals(v2.get(i))) {
                    return v1.get(i) - v2.get(i);
                }
            }

            return v1.size() - v2.size();
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