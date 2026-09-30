import java.util.*;
import java.math.*;
import java.io.*;

public class main {
	static String chuanHoa(String s) {
		s = s.trim().toLowerCase();
		String a[] = s.split("\\s+");
		StringBuilder res = new StringBuilder();
		for(String x : a) {
			res.append(Character.toLowerCase(x.charAt(0))).append(x.substring(1)).append(" ");
		}
		return res.toString().trim();
	}
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(new File("DANHSACH.in"));
		Set<String> daco = new HashSet<>();
		Map<String, Integer> dem = new HashMap<>();
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			String ten = chuanHoa(line);
			String key = ten.toLowerCase();
			if(daco.contains(key)) continue;
			daco.add(key);
			String a[] = ten.split("\\s+");
			String tenChinh = a[a.length - 1].toLowerCase();
			StringBuilder vietTat = new StringBuilder();
			for(int i = 0; i < a.length - 1; i++) {
				vietTat.append(Character.toLowerCase(a[i].charAt(0)));
			}
			String email = tenChinh + vietTat + "@ptit.edu.vn";
			int cnt = dem.getOrDefault(email, 0) + 1;
			dem.put(email, cnt);
			if(cnt > 1) {
				email = tenChinh + vietTat + cnt + "@ptit.edu.vn";
			}
			System.out.println(email);
		}
        sc.close();
	}
}