import java.util.*;

class Point {
	private double x, y;
	Point(double x, double y) {
		this.x = x;
		this.y = y;	
	}
	public static Point nextPoint(Scanner sc) {
		return new Point(sc.nextDouble(), sc.nextDouble());
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
}
class Triangle {
	private Point a, b, c;
	Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public boolean valid() {
		double ab = Math.sqrt((b.getX() - a.getX()) * (b.getX() - a.getX()) + (b.getY() - a.getY()) * (b.getY() - a.getY()));
		double ac = Math.sqrt((c.getX() - a.getX()) * (c.getX() - a.getX()) + (c.getY() - a.getY()) * (c.getY() - a.getY()));
		double bc = Math.sqrt((c.getX() - b.getX()) * (c.getX() - b.getX()) + (c.getY() - b.getY()) * (c.getY() - b.getY()));
		if(ab + bc > ac && ab + ac > bc && ac + bc > ab) {
			return true;
		}
		return false;
	}
	public String getPerimeter() {
        double ab = Math.sqrt((b.getX() - a.getX()) * (b.getX() - a.getX()) + (b.getY() - a.getY()) * (b.getY() - a.getY()));
        double bc = Math.sqrt((c.getX() - b.getX()) * (c.getX() - b.getX()) + (c.getY() - b.getY()) * (c.getY() - b.getY()));
        double ca = Math.sqrt((a.getX() - c.getX()) * (a.getX() - c.getX()) + (a.getY() - c.getY()) * (a.getY() - c.getY()));
        return String.format("%.3f", ab + bc + ca);
    }
}
public class J04019 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}