import java.util.*;

public class J01010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            String s = sc.next();

            char a[] = s.toCharArray();
            boolean ok = false;
            for(int i = 0; i < a.length; i++) {
                if(a[i] == '0' || a[i] == '1') continue;
                else if(a[i] == '8' || a[i] == '9') a[i] = '0';
                else {
                    ok = true;
                    break;
                } 
            }
            if(ok) {
                System.out.println("INVALID");
            }
            else {
                long x = Long.parseLong(new String(a));
                System.out.println(x);
            }
        }
        sc.close();
    }
}
