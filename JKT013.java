import java.util.*;

public class JKT013 {

    static void solve(int n) {
        Queue<String> q = new LinkedList<>();
        ArrayList<String> ans = new ArrayList<>();

        q.offer("6");
        q.offer("8");

        while (!q.isEmpty()) {
            String s = q.poll();

            if (s.length() > n) continue;

            ans.add(s);

            if (s.length() < n) {
                q.offer(s + "6");
                q.offer(s + "8");
            }
        }

        System.out.println(ans.size());

        for (int i = ans.size() - 1; i >= 0; i--) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            solve(sc.nextInt());
        }
        sc.close();
    }
}