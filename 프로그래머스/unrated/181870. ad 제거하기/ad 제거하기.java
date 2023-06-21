import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
    ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < strArr.length; i++) {
            if(!strArr[i].contains("ad")) { 
                list.add(strArr[i]);
            }

        }
        String[] answer = new String[list.size()];
        for (int j = 0; j < list.size(); j++) {
            answer[j] = list.get(j);
        }
        
        return answer;
    }
}