import java.util.*;

public class J01025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        int xmin = Math.min(x1,x3);
        int xmax = Math.max(x2,x4);

        int ymin = Math.min(y1,y3);
        int ymax = Math.max(y2,y4);

        int side = Math.max((xmax- xmin),(ymax-ymin));
        System.out.println(side*side);
        sc.close();
    }
}
