import java.util.*;
import java.io.*;

class IntSet {
	private int a[];
	IntSet(int a[]) {
		this.a = a;
	}
	public IntSet intersection(IntSet b) {
		TreeSet<Integer> se = new TreeSet<>();
		for(int i = 0; i < a.length; i++) se.add(a[i]);
		TreeSet<Integer> se2 = new TreeSet<>();
		for(int i = 0; i < b.a.length; i++) {
			if(se.contains(b.a[i])) se2.add(b.a[i]);
		}
		int res[] = new int[se2.size()];
		int cnt = 0;
		for(Integer x : se2) res[cnt++] = x;
		return new IntSet(res);
	}
	@Override
	public String toString() {
		String tmp = "";
		for(int i = 0; i < a.length; i++) {
			tmp += a[i] + " ";
		}
		return tmp;
	}
}

public class J07009 {
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}