class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int cal = 2 * a * b;
            
       String s_a = Integer.toString(a);
        String s_b = Integer.toString(b);
        
        String s_ab = s_a + s_b;
        
        int ab = Integer.parseInt(s_ab);
        if (ab < cal) {
            answer = cal;
        } else {
            answer = ab;
        }
        
        
        return answer;
    }
}