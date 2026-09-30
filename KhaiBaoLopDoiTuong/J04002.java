import java.util.*;
import java.math.*;

class Rectangle {
    private double width, height;
    private String color;
    public Rectangle() { 
        width = 1;
        height = 1;
    }
    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color; 
    } 
    public String getColor() {
        return color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
    }
    public double Area() {
        return width * height;
    }
    public double Perimeter() {
        return 2 * (width + height);
    }
}

public class J04002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        String c = sc.next();
        if(w > 0 && h > 0) {
            Rectangle rec = new Rectangle(w, h, c);
            System.out.printf("%.0f %.0f %s%n", rec.Perimeter(), rec.Area(), rec.getColor());
        }
        else {
            System.out.println("INVALID");
        }
        sc.close();
    }
}
