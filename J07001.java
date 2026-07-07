import java.io.File;
import java.util.*;

public class J07001 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DATA.in"));

        while (sc.hasNext()) {
            System.out.print(sc.next() + " ");
        }
        sc.close(); 
    }
}