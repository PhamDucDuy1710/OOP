import java.util.*;
import java.math.*;

class GiaoVien {
    private String mgv, ten;
    private long luongCoban;
    GiaoVien(String mgv, String ten, long luongCoban) {
        this.mgv = mgv;
        this.ten = ten;
        this.luongCoban = luongCoban;
    }
    public long getHesoluong() {
        return Long.parseLong(mgv.substring(2));
    }
    public long getPhucap() {
        String tmp = mgv.substring(0,2);
        switch (tmp) {
            case "HT":
                return 2000000;
            case "HP":
                return 900000;
            case "GV":
                return 500000;
            default:
                return 0;
        }
    }
    public long getThunhap() {
        return luongCoban * getHesoluong() + getPhucap();
    }
    @Override
    public String toString() {
        return mgv + " " + ten + " " + getHesoluong() + " " + getPhucap() + " " + getThunhap(); 
    }
}

public class J04015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mgv = sc.nextLine();
        String ten = sc.nextLine();
        long luongCoban = sc.nextLong();
        GiaoVien a = new GiaoVien(mgv, ten, luongCoban);
        System.out.println(a);
    }
}
