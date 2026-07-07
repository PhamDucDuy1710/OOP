import java.util.*;

public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            TreeSet<String> set1 = new TreeSet<>();
            HashSet<String> set2 = new HashSet<>();
            for(String x : s1.split("\\s+")) {
                set1.add(x);
            }
            for(String x : s2.split("\\s+")) {
                set2.add(x);
            }
            for(String x : set1) {
                if(!set2.contains(x)) {
                    System.out.print(x + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
