import java.util.*;

public class J02022 {

    static int n;
    static boolean used[] = new boolean[10];
    static int a[] = new int[10];

    public static void Try(int pos) {
        if(pos == n) {
            for(int i = 0; i < n; i++) {
                System.out.print(a[i]);
            }
            System.out.println();
            return;
        }
        for(int i = 1; i <= n; i++) {
           if(!used[i]) {
                if(pos > 0 && Math.abs(a[pos - 1] - i) == 1) {
                    continue;
                }
                a[pos] = i;
                used[i] = true;
                Try(pos + 1);
                used[i] = false;
           } 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            n = sc.nextInt();
            Arrays.fill(used,false);
            Try(0);
        } 
        sc.close();
    }
}
