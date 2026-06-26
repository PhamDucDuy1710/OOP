import java.util.*;

public class J03004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine().trim();
            String[] a = s.split("\\s+");
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < a.length; i++) {
                String x = a[i].toLowerCase();
                res.append(Character.toUpperCase(x.charAt(0)));
                if (x.length() > 1) {
                    res.append(x.substring(1));
                }
                if (i < a.length - 1) {
                    res.append(" ");
                }
            }
            System.out.println(res);
        }
        sc.close();
    }
}