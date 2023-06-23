import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        int length = my_string.length();
        String[] suffixes = new String[length];
        
        // 모든 접미사 추출
        for (int i = 0; i < length; i++) {
            suffixes[i] = my_string.substring(i);
        }
        
        // 사전순으로 정렬
        Arrays.sort(suffixes);
        
        return suffixes;
    }
}
