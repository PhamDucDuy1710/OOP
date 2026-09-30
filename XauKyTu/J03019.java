import java.util.Scanner;

public class J03019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        StringBuilder res = new StringBuilder();
        char maxChar = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c >= maxChar) {
                res.append(c);
                maxChar = c;
            }
        }

        System.out.println(res.reverse());
    }
}