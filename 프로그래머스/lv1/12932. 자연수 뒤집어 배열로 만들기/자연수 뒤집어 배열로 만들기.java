import java.util.*;

class Solution {
    public int[] solution(long n) {
        List<Integer> rt = new ArrayList<>();
        while (n > 0) {
            int digit = (int) (n % 10);
            rt.add(digit);
            n /= 10;
        }
        
        int[] answer = new int[rt.size()];
        for (int i = 0; i < rt.size(); i++) {
            answer[i] = rt.get(i);
        }
        
        return answer;
    }
}
