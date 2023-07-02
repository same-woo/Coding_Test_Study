public class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int x = 0, y = 0;
        int num = 1;
        int dir = 0;

        for (int i = 0; i < n * n; i++) {
            answer[x][y] = num;
            num++;

            int nx = x + direction[dir][0];
            int ny = y + direction[dir][1];

            if (nx < 0 || nx >= n || ny < 0 || ny >= n || answer[nx][ny] != 0) {
                dir = (dir + 1) % 4;
                nx = x + direction[dir][0];
                ny = y + direction[dir][1];
            }

            x = nx;
            y = ny;
        }

        return answer;
    }
}
