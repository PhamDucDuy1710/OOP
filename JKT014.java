import java.util.*;

public class JKT014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Stack<Integer> st = new Stack<>();
            for(int i = 0; i < n; i++) {
                while(!st.isEmpty() && a[st.peek()] <= a[i]) st.pop();

                if(st.isEmpty()) b[i] = i + 1;
                else b[i] = i - st.peek();

                st.push(i);
            }
            for(int x : b) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
