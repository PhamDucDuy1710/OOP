import java.util.*;

public class J03027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == c)
                st.pop();
            else
                st.push(c);
        }

        if (st.isEmpty()) {
            System.out.println("Empty String");
        } else {
            StringBuilder ans = new StringBuilder();
            for (char c : st)
                ans.append(c);
            System.out.println(ans);
        }
        sc.close();
    }
}