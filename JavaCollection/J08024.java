import java.util.*;

public class J08024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            q.offer("9");

            while (!q.isEmpty()) {
                String s = q.poll();

                int rem = 0;
                for (int i = 0; i < s.length(); i++)
                    rem = (rem * 10 + s.charAt(i) - '0') % n;

                if (rem == 0) {
                    System.out.println(s);
                    break;
                }

                q.offer(s + "0");
                q.offer(s + "9");
            }
        }
        sc.close();
    }
}
