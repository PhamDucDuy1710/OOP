import java.util.*;

public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int tc = 1; tc <= t; tc++) {
            int n = sc.nextInt();
            LinkedHashMap<Integer, Integer> mp = new LinkedHashMap<>();
            for(int i = 0; i < n; i++) {
                int x = sc.nextInt();
                mp.put(x, mp.getOrDefault(x, 0) + 1);
            }
            System.out.println("Test " + tc + ":");

            for(Map.Entry<Integer, Integer> e : mp.entrySet()) {
                System.out.println(e.getKey() + " xuat hien " + e.getValue() + " lan");
            }
        }
        sc.close();
    }
}