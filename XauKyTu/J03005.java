import java.util.*;

public class J03005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            String s = sc.nextLine().trim();
            String[] a = s.split("\\s+");

            StringBuilder res = new StringBuilder();

            for (int i = 1; i < a.length; i++) {
                String w = a[i].toLowerCase();
                res.append(Character.toUpperCase(w.charAt(0)))
                   .append(w.substring(1));

                if (i != a.length - 1)
                    res.append(" ");
            }

            System.out.println(res + ", " + a[0].toUpperCase());
        }

        sc.close();
    }
}