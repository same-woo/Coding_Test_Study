class Solution {
    public int solution(int n) {
        int answer = 0;
        int min = n;
        
       for (int i = 1; i < n; i++) {
        if (n % i == 1 ) {
            if (i < min) {
                min = i;
            }
        }   
       } 
        answer = min;
        return answer;
    }
}