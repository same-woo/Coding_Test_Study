import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] result = s.split("");
        Arrays.sort(result);
        
       for (int i = result.length-1; i > -1; i--) {
           answer += result[i];
       } 

        return answer;
        
        
    }
}