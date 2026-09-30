import java.util.*;


public class J08022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int n = sc.nextInt();
            Long a[] = new Long[n];
            Long b[] = new Long[n];
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            Stack<Long> st = new Stack<>();
            for(int i = n - 1; i >=0; i--) {
                while(!st.isEmpty() && st.peek() <= a[i]) st.pop();
                if(st.isEmpty()) b[i] = -1L;
                else b[i] = st.peek();

                st.push(a[i]);
            }
            for(long x : b) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
