import java.util.*;

public class J01005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int n = sc.nextInt();
            int h = sc.nextInt();
            double s = 0.5 * h;
            double s1 = s / n;
            double h1 = (Math.sqrt(2 * s1 * h));
            System.out.printf("%.6f ",h1);
            for(int i = 2; i <= n - 1; i++) {
                double res = s1 * i;
                double ans = (Math.sqrt(2 * res * h));
                System.out.printf("%.6f ", ans); 
            }
            System.out.println();
        }
        sc.close();
    } 
}
