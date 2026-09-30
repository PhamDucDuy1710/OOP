import java.util.*;

public class J02036 {
    public static long gcd(long a, long b) {
        while(b != 0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    public static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.print(a[0] + " ");
            for(int i = 0; i < n - 1; i++) {
                System.out.print(lcm(a[i], a[i + 1]) + " ");
            }
            System.out.println(a[n - 1]);
        }
        sc.close();
    }
}