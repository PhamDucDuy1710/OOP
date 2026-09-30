import java.util.*;
import java.math.*;

class PhanSo { 
    private long tu, mau;
    private long gcd(long a, long b) {
        while(b != 0) {
            long tmp = a % b; 
            a = b;
            b = tmp;
        }
        return a;
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

public class J04014 {
    static PhanSo Tong(PhanSo a, PhanSo b) {
        long tu1 = a.getX(), mau1 = a.getY();
        long tu2 = b.getX(), mau2 = b.getY();
        long tu = tu1 * mau2 + tu2 * mau1;
        long mau = mau1 * mau2;
        return new PhanSo(tu, mau);
    }
    static PhanSo Tich(PhanSo a, PhanSo b) {
        long tu1 = a.getX(), mau1 = a.getY();
        long tu2 = b.getX(), mau2 = b.getY();
        long tu = tu1 * tu2;
        long mau = mau1 * mau2;
        return new PhanSo(tu, mau);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            long tu1 = sc.nextLong();
            long mau1 = sc.nextLong();
            PhanSo A = new PhanSo(tu1, mau1);
            long tu2 = sc.nextLong();
            long mau2 = sc.nextLong();
            PhanSo B = new PhanSo(tu2, mau2);
            PhanSo C = Tich(Tong(A,B), Tong(A,B));
            System.out.print(C.getX() + "/" + C.getY() + " ");
            PhanSo D = Tich(C, Tich(A, B));
            System.out.println(D.getX() + "/" + D.getY());
            
        }
    }
}
