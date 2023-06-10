class Solution {
    public int solution(int hp) {
        int answer=0;
        int result=0;
        
        if (hp >= 5) {
            result += hp / 5;
            hp %= 5;        
        } 
        if (hp >= 3) {
            result += hp / 3;
            hp %= 3;       
        }
        if (hp >= 1) {
            result += hp / 1;
            hp %= 1;  
        }
            answer = result;
            return answer;
    }
}