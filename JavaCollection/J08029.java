import java.util.*;

public class J08029 {
    static int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
    static int[] dy = {-1, 1, -2, 2, -2, 2, -1, 1};
    static int bfs(String s, String t) {
        int sx = s.charAt(0) - 'a';
        int sy = s.charAt(1) - '1';
        int tx = t.charAt(0) - 'a';
        int ty = t.charAt(1) - '1';
        Queue<int[]> q = new LinkedList<>();
        int d[][] = new int[8][8];
        for (int i = 0; i < 8; i++) {
            Arrays.fill(d[i], -1);
        }
        q.add(new int[]{sx, sy});
        d[sx][sy] = 0 ;
        while (!q.isEmpty()) {
            int[] p = q.poll();
            int x = p[0];
            int y = p[1];
            if (x == tx && y == ty) {
                return d[x][y];
            }
            for (int i = 0; i < 8; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && nx < 8 &&
                    ny >= 0 && ny < 8 &&
                    d[nx][ny] == -1) {
                    
                    d[nx][ny] = d[x][y] + 1;
                    q.add(new int[]{nx, ny});
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            String s = sc.next();
            String m = sc.next();
            System.out.println(bfs(s, m));
        }
        sc.close();
    }
}