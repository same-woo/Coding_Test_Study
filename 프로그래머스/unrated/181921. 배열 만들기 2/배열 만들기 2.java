import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = l; i <= r; i++) {
            String numStr = Integer.toString(i);
            if(numStr.matches(".*[1-4].*") || numStr.matches(".*[6-9].*")) {
                continue;
            }
            result.add(i);
        }
        
        int[] answer = new int[result.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        
        if(answer.length == 0) {
            answer = new int[1];
            answer[0] = -1;
        }
        
        return answer;
    }
}