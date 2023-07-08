class Solution {
    public int[][] solution(int[] num_list, int n) {
        int len_n = num_list.length/n;
        int[][] answer = new int[len_n][n];
        for (int i = 0; i < len_n; i++) {
            for (int j= 0; j < n; j++) {
                answer[i][j] += num_list[(i*n)+j];
            }
        }
        
        
        return answer;
    }
}