import java.util.*;

public class J02033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        long sum = 0;
        for(int i = 0; i < n && k > 0; i++) {
            if(a[i] < 0) {
                a[i] = -a[i];
                k--;
            }
        }
        if(k % 2 == 1) {
            Arrays.sort(a);
            a[0] = -a[0];
        }
        for(int x : a) {
            sum += x;
        }
        System.out.println(sum);
        sc.close();
    }
}