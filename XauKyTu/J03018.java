import java.util.*;

public class J03018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            String s = sc.next();
            int r = 0;
            for(char c : s.toCharArray()) {
                r = (r * 10 + c - '0') % 4;
            }
            System.out.println(r == 0 ? 4 : 0);
        }
        sc.close();
    }
}
