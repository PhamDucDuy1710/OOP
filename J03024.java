import java.util.*;

public class J03024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            String s = sc.nextLine();

            boolean ok = true;

            if (s.charAt(0) == '0') ok = false;

            int chan = 0, le = 0;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (!Character.isDigit(c)) {
                    ok = false;
                    break;
                }

                if ((c - '0') % 2 == 0)
                    chan++;
                else
                    le++;
            }

            if (!ok) {
                System.out.println("INVALID");
            } else {
                if (s.length() % 2 == 0) {
                    System.out.println(chan > le ? "YES" : "NO");
                } else {
                    System.out.println(le > chan ? "YES" : "NO");
                }
            }
        }

        sc.close();
    }
}
