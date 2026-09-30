import java.util.*;
public class J02034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = 1;
        boolean ok = false;
        Arrays.sort(a);
        for(int i = 0; i < n; i++) {
            while (k < a[i]) {
                ok = true;
                System.out.println(k);
                k++;
            }

            if (k == a[i]) {
                k++;
            }
        }
        if(!ok) System.out.println("Excellent!");
        sc.close();
    }
}
// public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int a[] = new int[n];
    //     for(int i = 0; i < n; i++) {
    //         a[i] = sc.nextInt();
    //     }
    //     boolean ok = false;
    //     int j = 0;
    //     for(int i = 1; i <= a[n-1]; i++) {
    //         if(j < n && a[j] == i) {
    //             j++;
    //         }
    //         else {
    //             System.out.println(i);
    //             ok = true;
    //         }
    //     }
    //     if(!ok) {
    //         System.out.println("Excellent!");
    //     }
    //     sc.close();
    // }