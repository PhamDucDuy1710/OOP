import java.util.*;
import java.io.File;

public class HELLOFILE {
    public static void main(String[] args) throws Exception {
        File file = new File("Hello.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }  
}
