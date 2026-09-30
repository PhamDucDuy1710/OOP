import java.util.*;

public class J01013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nt[] = new int[2000001];
        for(int i = 1; i <= 2000000; i++) {
            nt[i] = i;
        }
        for(int i = 2; i * i <= 2000000; i++) {
            if(nt[i] == i) {
                for(int j = i * i; j <= 2000000; j += i) {
                    if(nt[j] == j) {
                        nt[j] = i;
                    }
                }
            }
        }
        int n = sc.nextInt();
        long sum = 0;
        while(n-- >0) {
            int x = sc.nextInt();
            while(x != 1) {
                sum += nt[x];
                x /= nt[x];
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
