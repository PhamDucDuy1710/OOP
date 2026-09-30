import java.util.*;

public class J01010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            char[] a = s.toCharArray();
            boolean invalid = false;
            boolean hasOne = false;

            for (int i = 0; i < a.length; i++) {
                if (a[i] == '0' || a[i] == '1') {
                    if (a[i] == '1') hasOne = true;
                }
                else if (a[i] == '8' || a[i] == '9') {
                    a[i] = '0';
                }
                else {
                    invalid = true;
                    break;
                }
            }

            if (invalid || !hasOne) {
                System.out.println("INVALID");
            } else {
                String ans = new String(a).replaceFirst("^0+", "");
                System.out.println(ans);
            }
        }

        sc.close();
    }
}