import java.util.*;
import java.math.*;

class SinhVien {
    private String msv = "B20DCCN001";
    private String name, lop, date;
    private double gpa;

    SinhVien(String name, String lop, String date, double gpa) {
        this.name = name;
        this.lop = lop;
        this.date = date;
        this.gpa = gpa;
    }

    public String dateFormat() {
        StringBuilder sb = new StringBuilder(date.trim());
        if(sb.charAt(1) == '/') {
            sb.insert(0, "0");
        }
        if(sb.charAt(4) == '/') {
            sb.insert(3, "0");
        }
        return sb.toString();
    }
    @Override
    public String toString() {
        return msv + " " + name + " " + lop + " " + dateFormat() + " " + String.format("%.2f", gpa);
    }
}

public class J04006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String lop = sc.nextLine();
        String date = sc.nextLine();
        Double gpa = sc.nextDouble();
        SinhVien a = new SinhVien(name, lop, date, gpa);
        System.out.println(a);
    }
}
