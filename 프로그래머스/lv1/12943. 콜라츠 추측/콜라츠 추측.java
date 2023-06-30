class Solution {
    public int solution(int num) {
        int answer = 0;
        
        while (num != 1) {
            if (answer >= 480) {
                answer = -1;
                break;
            }
            if (num % 2 == 0) {
                num /= 2;
                answer++;
            }
            
            else if (num % 2 != 0) {
                num = (num*3) +1;
                answer++;
            }
        }
        
        return answer;
    }
}