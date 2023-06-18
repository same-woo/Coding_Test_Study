import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        Integer[] indices = new Integer[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            indices[i] = i;
        }
        
        Arrays.sort(indices, Comparator.comparingInt(i -> emergency[i]));
        
        for (int i = 0; i < emergency.length; i++) {
            answer[indices[i]] = emergency.length - i;
        }
        
        return answer;
    }
}
