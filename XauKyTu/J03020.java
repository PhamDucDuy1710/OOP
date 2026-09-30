import java.util.*;

public class J03020 {
    public static boolean check(String s) {
        for(int i = 0; i < s.length() / 2; i++) {
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        } 
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> mp = new LinkedHashMap<>();
        int max_len = 0;
        while(sc.hasNext()) {
            String s = sc.next();
            if(check(s)) {
                mp.put(s, mp.getOrDefault(s, 0) + 1);
                max_len = Math.max(max_len, s.length());
            }
        }
        for(Map.Entry<String, Integer> e : mp.entrySet()) {
            if(e.getKey().length() == max_len) {
                System.out.println(e.getKey() + " " + e.getValue());
            }
        }
        sc.close();
    }
}