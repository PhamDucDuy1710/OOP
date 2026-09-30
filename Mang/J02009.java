import java.util.*;

public class J02009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt(); 
            a[i][1] = sc.nextInt(); 
        }
        Arrays.sort(a, (x, y) -> Integer.compare(x[0], y[0]));
        long time = 0;
        for (int i = 0; i < n; i++) {
            time = Math.max(time, a[i][0]);
            time += a[i][1];
        }
        System.out.println(time);
        sc.close();
    }
}
