import java.io.File;
import java.util.*;

public class J07002 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DATA.in"));

        long sum = 0;

        while (sc.hasNext()) {
            String s = sc.next();

            try {
                int x = Integer.parseInt(s);
                sum += x;
            } catch (Exception e) {
                // Không phải số int thì bỏ qua
            }
        }

        System.out.println(sum);
        sc.close();
    }
}