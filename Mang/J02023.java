
import java.util.*;

public class J02023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        if(s == 0 || s > 9 * n) {
            System.out.println("-1 -1");
            return;
        }
        int sum = s;
        StringBuilder max = new StringBuilder();
        for(int i = 0; i < n; i++) {
            int x = Math.min(9, sum);
            max.append(x);
            sum -= x;
        }
        sum = s;
        StringBuilder min = new StringBuilder();
        for(int i = 0; i < n; i++) {
            for(int d = 0; d <= 9; d++) {
                if(i == 0 && d == 0) {
                    continue;
                }
                int remain = n - i - 1;
                int l = sum - d;
                if(l >= 0 && l <= 9 * remain) {
                    min.append(d);
                    sum = l;
                    break;
                }
            }
        }
        System.out.println(min + " " + max);
        sc.close();
    }
}