import java.util.*;
public class J03010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        HashMap<String, Integer> mp = new HashMap<>();
        while(t-- >0) {
            String s = sc.nextLine().trim().toLowerCase();
            String a[] = s.split("\\s+");
            String email = a[a.length - 1];
            for(int i = 0; i < a.length - 1; i++) {
                email += a[i].charAt(0);
            }
            if(mp.containsKey(email)) {
                mp.put(email, mp.get(email) + 1);
                System.out.println(email + mp.get(email) + "@ptit.edu.vn");
            }
            else {
                mp.put(email, 1);
                System.out.println(email + "@ptit.edu.vn");
            }
        }
        sc.close();
    }
}
