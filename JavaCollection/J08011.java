import java.util.*;

public class J08011 {
    public static boolean check(String s) {
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) < s.charAt(i - 1)) return false;
        } 
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> mp = new LinkedHashMap<>();
        while(sc.hasNext()) {
            String s = sc.next();
            if(check(s)) {
                mp.put(s, mp.getOrDefault(s, 0) + 1);
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(mp.entrySet());
        list.sort((a, b) ->  {
            return b.getValue() - a.getValue();
        });
        for(Map.Entry<String, Integer> e : list) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
        sc.close();
    }
}