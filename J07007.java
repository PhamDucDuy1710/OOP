import java.io.File;
import java.util.*;

public class J07007 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("VANBAN.in"));

        TreeSet<String> set = new TreeSet<>();

        while (sc.hasNext()) {
            set.add(sc.next().toLowerCase());
        }

        for (String s : set) {
            System.out.println(s);
        }
        sc.close(); 
    }
}