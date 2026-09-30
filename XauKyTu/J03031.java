import java.util.*;

public class J03031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            String s = sc.next();
            int k = sc.nextInt();
            Map<Character, Integer> mp = new HashMap<>();
            for(int i = 0; i < s.length(); i++) {
                mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) + 1);
            }
            if(mp.size() + k >= 26) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
