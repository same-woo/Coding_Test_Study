import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int s_long = 0;
        int s_short = 0;
        
       // 주어진 값에서 길이를 비교
//         if (sides[0] > sides[1]) {
//             s_long = sides[0];
//             s_short = sides[1];
            
//         } else if (sides[1] > sides[0]) {
//             s_long = sides[1];
//             s_short = sides[0];
//         }
        Arrays.sort(sides);
        s_short = sides[0];
        s_long = sides[1];
        
        
        // 가장 긴변이 주어진 값일 경우
        for (int i = s_long-s_short+1; i <= s_long; i++) {
                answer++;
            }
        
        
        // // 나머지 한 변이 가장 긴 변인 경우
        for (int i = s_long+1; i < s_short+s_long; i++) {
                answer++;
            }
        
        
        return answer;
    }
}