import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        int answer = -1;
        Map<Integer, Integer> countMap = new HashMap<>();
        int maxCount = 0;
        
        for (int num : array) {
            int count = countMap.getOrDefault(num, 0) + 1;
            countMap.put(num, count);
            maxCount = Math.max(maxCount, count);
        }
        
        int frequencyCount = 0;
        for (int num : countMap.keySet()) {
            if (countMap.get(num) == maxCount) {
                frequencyCount++;
                if (frequencyCount > 1) {
                    return -1;
                }
                answer = num;
            }
        }
        
        return answer;
    }
}
