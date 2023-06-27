import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;

        // long 값을 문자열로 변환하여 배열에 저장
        String numStr = Long.toString(n);
        String[] numArr = numStr.split("");

        // 문자열 배열을 내림차순으로 정렬
        Arrays.sort(numArr, Collections.reverseOrder());

        // 정렬된 문자열 배열을 다시 long 값으로 변환
        StringBuilder sb = new StringBuilder();
        for (String num : numArr) {
            sb.append(num);
        }
        answer = Long.parseLong(sb.toString());

        return answer;
    }
}
