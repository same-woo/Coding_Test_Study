import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int temp = 0;
        
        Arrays.sort(d);
        
        for (int i = 0; i < d.length; i++) {
                temp += d[i];
            if (temp > budget) {
                break;
            } else if (temp <= budget) { // 수정된 부분
                answer += 1;
            }
        }
        
        return answer;
    }
}
