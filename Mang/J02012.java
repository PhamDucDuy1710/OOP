import java.util.*;

public class J02012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] =  new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            int j = i;
            while(j > 0 && a[j-1] > a[j]) {
                int tmp = a[j];
                a[j] = a[j-1];
                a[j-1] = tmp;
                j--;
            }
            System.out.print("Buoc " + (i) + ": ");
            for(int k = 0; k <= i; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
