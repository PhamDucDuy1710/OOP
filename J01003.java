import java.util.*;

public class J01003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if(x == 0 && y == 0) {
            System.out.println("VSN");
        }
        else if(x == 0 && y != 0) {
            System.out.println("VN");
        }
        else {
            double ans = (double)(-y / x);
            System.out.printf("%.2f",ans);
        }
        sc.close();
    }
}
