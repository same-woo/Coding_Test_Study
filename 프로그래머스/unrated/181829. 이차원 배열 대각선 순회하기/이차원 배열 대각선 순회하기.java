public class Solution {
    public int solution(int[][] board, int k) {
        int rows = board.length;
        int cols = board[0].length;
        int totalSum = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i + j <= k) {
                    totalSum += board[i][j];
                }
            }
        }

        return totalSum;
    }
}
