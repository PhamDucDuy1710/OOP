import java.util.*;

public class J08023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int n = sc.nextInt();
            int a[] = new int[n + 1];
            int l[] = new int[n + 1];
            int r[] = new int[n + 1];
            for(int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            Stack<Integer> st = new Stack<>();
            for(int i = 1; i <= n; i++) {
                while(!st.empty() && a[st.peek()] >= a[i]) {
                    st.pop();
                }
                if(st.empty()) l[i] = 1;
                else l[i] = st.peek() + 1;
                st.push(i);
            }
            while(!st.empty()) st.pop();
            for(int i = n; i >= 1; i--) {
                while(!st.empty() && a[st.peek()] >= a[i]) st.pop();
                if(st.empty()) r[i] = n;
                else r[i] = st.peek() - 1;
                st.push(i);
            }
            long ans = 1;
            for(int i = 1; i <= n; i++) {
                long s = (long) a[i] * (r[i] - l[i] + 1);
                ans = Math.max(ans, s);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}