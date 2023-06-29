class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
                answer += absolutes[i];
            if (!signs[i]) {
                answer -= absolutes[i]*2;
            }

        }
        
        return answer;
    }
}