import java.util.*;

public class J08021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            String s = sc.next();
            Stack<Integer> st = new Stack<>();
            st.push(-1);

            int maxx = 0;
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '(') {
                    st.push(i);
                }
                else {
                    st.pop();

                    if(!st.isEmpty()) {
                        maxx = Math.max(maxx,i - st.peek());
                    }
                    else {
                        st.push(i);
                    }
                }
            }
            System.out.println(maxx);
        }
        sc.close();
    }
}