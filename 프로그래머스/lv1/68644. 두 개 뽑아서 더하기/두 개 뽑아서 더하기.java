import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer>list = new ArrayList<>();
        
    for (int i = 0 ; i < numbers.length; i++) {
        for(int j = i+1; j < numbers.length; j++ ) {
            int result = numbers[i]+numbers[j];
            if (list.indexOf(result) < 0) {
                list.add(result);
            }
        }
    }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }
}