import java.util.*;

public class J08012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeSet<Integer>[] ke = new TreeSet[n + 1];
        for(int i = 1; i <= n; i++) {
            ke[i] = new TreeSet<>();
        }
        for(int i = 1; i <= n - 1; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            ke[x].add(y);
            ke[y].add(x);
        }
        boolean ok = false;
        for(int i = 1; i <= n; i++) {
            if(ke[i].size() == n - 1) {
                ok = true;
                break;
            }
        }
        if(ok) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        sc.close();
    }
}
