import java.util.*;

public class J01011 {

    public static int gcd(int a, int b) {
        while(b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    public static long lcm(int a, int b) {
        return (long)a * b / gcd(a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.print(lcm(a,b) + " ");
            System.out.println(gcd(a,b));
        } 
        sc.close();
    } 
}
