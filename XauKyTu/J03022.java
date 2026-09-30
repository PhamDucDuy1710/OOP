import java.util.*;
import java.io.*;
import java.math.*;

public class J03022 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a = new ArrayList();
        while(sc.hasNext()) {
            String s = sc.next().toLowerCase();
            a.add(s);
        }
        String ans = "";
        for(int i = 0; i < a.size(); i++) {
            ans += a.get(i) + " ";
        }
        char tmp[] = ans.toCharArray();
        for(int i = 0; i < tmp.length; i++) {
            if(i == 0) {
                tmp[i] = Character.toUpperCase(tmp[i]);
            }
            else if(i >= 1 && i + 1 < tmp.length && (tmp[i-1] == '.' || tmp[i-1] == '?' || tmp[i-1] == 
                '!'
            )) {
                tmp[i] = '\n';
                tmp[i + 1] = Character.toUpperCase(tmp[i + 1]);
            }
            else if(tmp[i] == '.' || tmp[i] == '?' || tmp[i] == '!') {
                continue;
            }
            System.out.print(tmp[i]);
        }
    }
}