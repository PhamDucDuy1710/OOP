import java.util.*;
public class J08020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            String s = sc.next();
            Stack<Integer> st = new Stack<>();
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == ')' && !st.isEmpty() && s.charAt(st.peek()) == '(') {
                    st.pop();
                }
                else if(s.charAt(i) == ']' && !st.isEmpty() && s.charAt(st.peek()) == '[') {
                    st.pop();
                }
                else if(s.charAt(i) == '}' && !st.isEmpty() && s.charAt(st.peek()) == '{') {
                    st.pop();
                }
                else {
                    st.push(i);
                }
            }
            if(st.isEmpty()) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
