import java.util.*;
import java.math.*;
import java.text.DecimalFormat;

class TS {
    private String mts, ten;
    private double toan, ly, hoa;
    TS(String mts, String ten, double toan, double ly, double hoa) {
        this.mts = mts;
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    public double getDiemUuTien() {
        String ans = mts.substring(0, 3);
        if(ans.equals("KV1")) return 0.5;
        if(ans.equals("KV2")) return 1.0;
        if(ans.equals("KV3")) return 1.5;
        return 0.0;
    }
    public double getTongDiem() {
        return toan * 2 + ly + hoa;
    }
    public String getTrangThai() {
        double xt = getTongDiem() + getDiemUuTien();
        return (xt >= 24) ? "TRUNG TUYEN" : "TRUOT";
    }
    private String formatDiem(double d) {
        DecimalFormat df = new DecimalFormat("#.#");
        return df.format(d);
    }

    @Override
    public String toString() {
        return mts + " " + ten + " " + formatDiem(getDiemUuTien()) + " " + formatDiem(getTongDiem()) + " " + getTrangThai();
    }
}

public class J04013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mts = sc.nextLine();
        String ten = sc.nextLine();
        double toan = sc.nextDouble();
        double ly = sc.nextDouble();
        double hoa = sc.nextDouble();
        TS a = new TS(mts, ten, toan, ly, hoa);
        System.out.println(a);
        sc.close();
    }
}
