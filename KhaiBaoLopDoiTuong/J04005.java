import java.util.*;
import java.math.*;

class ThiSinh {
    private String name, date;
    private float d1, d2, d3;

    ThiSinh() {
        name = "";
        date = "";
        d1 = d2 = d3 = 0;
    }
    ThiSinh(String name, String date, float d1, float d2, float d3) {
        this.name = name;
        this.date = date;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    @Override
    public String toString() {
        return name + " " + date + " " + String.format("%.1f", d1 + d2 + d3);
    }
}

public class J04005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String date = sc.nextLine();
        float d1 = sc.nextFloat();
        float d2 = sc.nextFloat();
        float d3 = sc.nextFloat();
        ThiSinh a = new ThiSinh(name, date, d1, d2, d3);
        System.out.println(a);
    }
}
