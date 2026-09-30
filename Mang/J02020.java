import java.util.*;

public class J02020 {
    static int a[] = new int[100];
    static int n;
    static int k;
    static int cnt = 0;
    public static void Try(int m) {
        for(int i = a[m-1] + 1;i <= n - k + m; i++) {
            a[m] = i;
            if(m == k) {
                cnt++;
                for(int j = 1; j <= k; j++) {
                    System.out.print(a[j] + " ") ;
                }
                System.out.println();
            }
            else {
                Try(m + 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        Try(1);
        System.out.println("Tong cong co " + cnt + " to hop");
        sc.close();
    }
}