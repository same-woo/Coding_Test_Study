class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            int count = 0; // Reset the count for each number
            
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            
            if (count > 2) {
                answer++;
            }
        }
        
        return answer;
    }
}
