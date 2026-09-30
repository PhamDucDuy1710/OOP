import java.util.*;

public class J02006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeSet<Integer> A = new TreeSet<>(); // tuong tu set<int> s ben c++;
        TreeSet<Integer> B = new TreeSet<>();
        for(int i = 0; i < n; i++) A.add(sc.nextInt());
        for(int i = 0; i < m; i++) B.add(sc.nextInt());
        A.addAll(B); // Phep hop
        for(int x : A) {
            System.out.print(x + " ");
        }
        sc.close();
    }
}
