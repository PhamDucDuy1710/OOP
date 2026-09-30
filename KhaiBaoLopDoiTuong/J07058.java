import java.util.*;
import java.io.*;

class MonHoc {
	private String ma, ten, hinhthuc;
	MonHoc(String ma, String ten, String hinhthuc) {
		this.ma = ma;
		this.ten = ten;
		this.hinhthuc = hinhthuc;
	}
	public String getMa() {
		return ma;
	}
	@Override 
	public String toString() {
		return ma + " " + ten + " " + hinhthuc;
	}
}

public class J07058 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("MONHOC.in"));
		int n = Integer.parseInt(sc.nextLine().trim());
		ArrayList<MonHoc> ds = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			String ma = sc.nextLine().trim();
			String ten = sc.nextLine().trim();
			String hinhthuc = sc.nextLine().trim();
			ds.add(new MonHoc(ma, ten, hinhthuc));
		}
		Collections.sort(ds, new Comparator<MonHoc>() {
			@Override
			public int compare(MonHoc o1, MonHoc o2) {
				return o1.getMa().compareTo(o2.getMa());
			}
		});
		for(MonHoc mh : ds) {
			System.out.println(mh);
		}
		sc.close();
	}
}