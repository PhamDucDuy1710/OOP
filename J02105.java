import java.util.*;

public class J02105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[1005][1005];
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 1; i <= n; i++) {
            Vector<Integer> v = new Vector<>();
            for(int j = 1; j <= n; j++) {
                if(a[i][j] == 1) {
                    v.add(j);
                }
            }
            System.out.print("List (" + i + ") = ");
            for(int x : v) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        sc.close();
    } 
}
