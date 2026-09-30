import java.util.*;
import java.math.*;

class Point {
    private double x, y;
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    } 
    static Double KC(Point a, Point b) {
        return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
    }
}

public class J04008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0) {
            Point A = new Point(sc.nextDouble(), sc.nextDouble());
            Point B = new Point(sc.nextDouble(), sc.nextDouble());
            Point C = new Point(sc.nextDouble(), sc.nextDouble());
            double c1 = Point.KC(A,B);
            double c2 = Point.KC(A,C);
            double c3 = Point.KC(B,C);
            if(c1 + c2 <= c3 || c1 + c3 <= c2 || c2 + c3 <= c1) {
                System.out.println("INVALID");
            }
            else {
                System.out.printf("%.3f\n", c1 + c2 + c3);
            }
        }
    }
}
