import java.util.*;

public class J04003 {
    static class Phanso {
        private long tu, mau;
        Phanso(long tu, long mau) {
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
        static long gcd(long a, long b) {
            while(a > 0) {
                long tmp = a;
                a = b % a;
                b = tmp;
            }
            return b;
        }
    }
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        Phanso a = new Phanso(x, y);
        System.out.println(a.getX() +  "/" + a.getY());
        sc.close();
    }
}
