import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String my_string2 = my_string.toLowerCase();
        String[] array = my_string2.split("");
        
        Arrays.sort(array);
        
        for (int i = 0; i < array.length; i++) {
            answer += array[i];
        }
        
        return answer;
    }
}