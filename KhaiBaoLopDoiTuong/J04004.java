import java.util.*;
import java.math.*;

class PhanSo {
    private long tu, mau;
    private static long gcd(long a, long b) {
        while(b > 0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    PhanSo() {
        tu = 0;
        mau = 1;
    }
    PhanSo(long tu, long mau) {
        long ucln = gcd(tu, mau);
        this.tu = tu / ucln;
        this.mau = mau / ucln;
    }
    public long getX() {
        return tu;
    }
    public long getY() {
        return mau;
    }
}
public class J04004 {
    static PhanSo Tong(PhanSo a, PhanSo b) {
        long x1 = a.getX(), y1 = a.getY();
        long x2 = b.getX(), y2 = b.getY();
        long tu = x1 * y2 + x2 * y1;
        long mau = y1 * y2;
        return new PhanSo(tu, mau);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tu1 = sc.nextLong();
        long mau1 = sc.nextLong();
        PhanSo p1 = new PhanSo(tu1, mau1);
        long tu2 = sc.nextLong();
        long mau2 = sc.nextLong();
        PhanSo p2 = new PhanSo(tu2, mau2);

        PhanSo tong = Tong(p1, p2);
        System.out.println(tong.getX() + "/" + tong.getY());
    }
}
