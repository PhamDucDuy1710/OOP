import java.util.*;

public class J02021 {
    static int a[] = new int[100];
    static int n;
    static int cnt = 0;
    static boolean vs[] = new boolean[100];
    public static void Try(int m) {
        for(int i = 1; i <= n; i++) {
            if(!vs[i]) {
                vs[i] = true;
                a[m] = i;
                if(m == n) {
                    boolean ok = true;
                    for(int j = 2; j <= n; j++) {
                        if(Math.abs(a[j] - a[j-1]) == 1) {
                            ok = false;
                            break;
                        }
                    }
                    if(ok) {
                        for(int j = 1; j <= n; j++) {
                            System.out.print(a[j]);
                        }
                        System.out.println();
                    }
                }
                else {
                    Try(m + 1);
                }
                vs[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            n = sc.nextInt();
            Try(1);
        }
        sc.close();
    }
}