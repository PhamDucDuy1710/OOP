import java.util.*;

public class J03017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            String s = sc.next();
            while(s.indexOf("100") != -1) {
                s = s.replace("100","");
            }
            System.out.println(s.length());
        }
        sc.close();
    }
}
