    import java.util.*;

public class J01001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        if(x <= 0 && y <= 0) {
            System.out.println(0);
        }
        else {
            long cv = (x + y) * 2;
            long dt = x * y;
            System.out.println(cv + " " + dt);
        }
        sc.close();
    }
}
