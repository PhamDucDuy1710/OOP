import java.util.*;

public class J02008 {

    public static int gcd(int a, int b) {
        while(b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    public static int lcm(int a, int b) {
        return a * b / gcd(a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int n = sc.nextInt();
            int res = 1;
            for(int i = 2; i <= n; i++) {
                res = lcm(res,i);
            }   
            System.out.println(res);
        } 
        sc.close();
    } 
}
