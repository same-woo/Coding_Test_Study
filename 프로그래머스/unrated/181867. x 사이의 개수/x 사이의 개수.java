import java.util.ArrayList;

class Solution {
    public int[] solution(String myString) {
        ArrayList<Integer> list = new ArrayList<>();
        
        String[] str = myString.split("x");
        
        for (int i = 0; i < str.length; i++) {
            list.add(str[i].length());
        }
        
        int[] answer = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            answer[j] = list.get(j);
        }    
        
        if (myString.endsWith("x")) {
            list.add(0);
            answer = new int[list.size()];
            for (int j = 0; j < list.size(); j++) {
                answer[j] = list.get(j);
            }
        }
        
        return answer;
    }
}
