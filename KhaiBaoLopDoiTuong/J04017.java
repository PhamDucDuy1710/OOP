import java.util.*;
import java.math.*;

class Matrix {
    private int n, m;
    private int a[][];
    Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.a = new int[n][m];
    }
    public void nextMatrix(Scanner sc) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    } 
    public Matrix trans() {
        Matrix b = new Matrix(m, n);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                b.a[j][i] = a[i][j];
            }
        }
        return b;
    }
    public Matrix mul(Matrix b) {
        Matrix res = new Matrix(n, b.m);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < b.m; j++) {
                for(int k = 0; k < m; k++) {
                    res.a[i][j] += a[i][k] * b.a[k][j];
                }
            }
        }
        return res;
    }
    @Override 
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                sb.append(a[i][j]).append(j == m - 1 ? "" : " ");
            }
            if(i < n - 1) sb.append("\n");
        }
        return sb.toString();
    }
}

public class J04017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), m = sc.nextInt();
            Matrix a = new Matrix(n,m);
            a.nextMatrix(sc);
            Matrix b = a.trans();
            System.out.println(a.mul(b));
        }
    }
}
