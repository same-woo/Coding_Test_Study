import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Set<Integer> numSet = new HashSet<>();

        for (int num : numbers) {
            numSet.add(num);
        }

        for (int i = 0; i < 10; i++) {
            if (!numSet.contains(i)) {
                answer += i;
            }
        }

        return answer;
    }
}
