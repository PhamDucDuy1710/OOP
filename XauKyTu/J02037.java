import java.util.*;

public class J02037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0) {
            String line = sc.nextLine().trim(); // Xoa khoang cach o dau va cuoi
            if(line.isEmpty()) {
                System.out.println("NO");
                continue;
            }
            String a[] = line.split("\\s+");
            int chan = 0;
            int le = 0;
            for(String x : a) {
                int n = Integer.parseInt(x);
                if(n % 2 == 0) {
                    chan++;
                }
                else {
                    le++;
                }
            }
            int n = a.length;
            if((n % 2 == 0 && chan > le) || (n % 2 == 1 && le > chan)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
