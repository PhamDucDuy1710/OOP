import java.util.*;
import java.math.*;

class NV {
    private String mnv = "NV01";
    private String ten, chucvu;
    private long luongNgay, ngay;
    NV(String ten, Long luongNgay, Long ngay, String chucvu) {
        this.ten = ten;
        this.luongNgay = luongNgay;
        this.ngay = ngay;
        this.chucvu = chucvu;
    }
    public long getLuongThang() {
        return luongNgay * ngay;
    }
    public long getThuong() {
        long luong = getLuongThang();
        if(ngay >= 25) {
            return Math.round(luong * 0.2);
        }
        else if(ngay >= 22) {
            return Math.round(luong * 0.1);
        }
        return 0;
    }
    public long getPhucap() {
        switch (chucvu) {
            case "GD" :
                return 250000;
            case "PGD" :
                return 200000;
            case "TP" :
                return 180000;
            case "NV" :
                return 150000;
            default: 
                return 0;
        }
    }
    public long getThunhap() {
        return getLuongThang() + getThuong() + getPhucap();
    }
    @Override
    public String toString() {
        return mnv + " " + ten + " " + getLuongThang() + " " + getThuong() + " " + getPhucap() + " " + getThunhap();
    }
}

public class J04012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        Long luongNgay = Long.parseLong(sc.nextLine());
        Long ngay = Long.parseLong(sc.nextLine());
        String chucvu = sc.nextLine();
        NV a = new NV(ten, luongNgay, ngay, chucvu);
        System.out.println(a);
    }
} 
