import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = "";
        
        str = Integer.toString(n);
        String[] str1 = str.split("");
        
        for (int i = 0; i < str1.length; i++) {
            answer += Integer.parseInt(str1[i]);
        }

        return answer;
    }
}