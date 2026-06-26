import java.util.*;

public class J02106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[1005][1005];
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int cnt = 0;
        for(int i = 1; i <= n; i++) {
            int cnt1 = 0, cnt0 = 0;
            for(int j = 1; j <= 3; j++) {
                if(a[i][j] == 1) {
                    cnt1++;
                }
                else {
                    cnt0++;
                }
            }
            if(cnt1 > cnt0) cnt++;
        }
        System.out.println(cnt);
        sc.close();
    } 
}
