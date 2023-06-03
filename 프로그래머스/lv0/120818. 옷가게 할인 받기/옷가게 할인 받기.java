class Solution {
    public int solution(int price) {
        int answer = 0;
        
        if (price >= 500000) {
            answer = (int) (price * 0.8);  // 20% discount
        } else if (price >= 300000) {
            answer = (int) (price * 0.9);  // 10% discount
        } else if (price >= 100000) {
            answer = (int) (price * 0.95);  // 5% discount
        } else {
            answer = price;  // No discount is applied
        }
        
        return answer;
    }
}
