import java.util.*;

public class J03032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] a = s.split("\\s+");

            for (String x : a) {
                System.out.print(new StringBuilder(x).reverse() + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}