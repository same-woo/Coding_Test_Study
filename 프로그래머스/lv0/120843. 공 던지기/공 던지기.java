class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 1;
        int k2 = 2*(k-1);
        
        answer += k2 % numbers.length;
        
        return answer;
    }
}