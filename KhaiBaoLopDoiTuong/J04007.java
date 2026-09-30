import java.util.*;
import java.math.*;

class NhanVien {
    private String mnv = "00001";
    private String name, gender, date1, address, mst, date2;

    NhanVien(String name, String gender, String date1, String address, String mst, String date2) {
        this.name = name;
        this.gender = gender;
        this.date1 = date1;
        this.address = address;
        this.mst = mst;
        this.date2 = date2;
    }
    @Override 
    public String toString() {
        return mnv + " " + name + " " + gender + " " + date1 + " " + address + " " + mst + " " + date2;
    }
}

public class J04007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String gender = sc.nextLine();
        String date1 = sc.nextLine();
        String address = sc.nextLine();
        String mst = sc.nextLine();
        String date2 = sc.nextLine();
        NhanVien a = new NhanVien(name, gender, date1, address, mst, date2);
        System.out.println(a);
    }
}
