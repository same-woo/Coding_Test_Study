import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> sequence = new ArrayList<>();
        sequence.add(n); // 초기값을 수열에 추가
        
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2; // 짝수인 경우 2로 나눔
            } else {
                n = 3 * n + 1; // 홀수인 경우 3을 곱하고 1을 더함
            }
            sequence.add(n); // 계산된 값을 수열에 추가
        }
        
        // 수열을 배열로 변환하여 반환
        int[] result = new int[sequence.size()];
        for (int i = 0; i < sequence.size(); i++) {
            result[i] = sequence.get(i);
        }
        
        return result;
    }
}
