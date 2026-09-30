import java.util.*;

public class J03004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            String s = sc.nextLine().trim();
            String[] words = s.split("\\s+");

            StringBuilder res = new StringBuilder();

            for (int i = 0; i < words.length; i++) {
                String w = words[i].toLowerCase();
                w = Character.toUpperCase(w.charAt(0)) + w.substring(1);

                res.append(w);
                if (i != words.length - 1) {
                    res.append(" ");
                }
            }

            System.out.println(res);
        }

        sc.close();
    }
}