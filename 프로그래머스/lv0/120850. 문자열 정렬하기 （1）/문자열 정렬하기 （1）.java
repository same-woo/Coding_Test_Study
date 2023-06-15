import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-z]","");
        
        String[] Array = my_string.split("");
        int[] answer = new int[Array.length];
        
        for (int i = 0; i < Array.length; i++) {
            answer[i] += Integer.parseInt(Array[i]);
        }
        Arrays.sort(answer);
        return answer;
    }
}