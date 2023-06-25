import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();
        String s_temp = "";
        int i_temp = 0;
        
        for (int i = 0; i < intStrs.length; i++) {
                s_temp = intStrs[i].substring(s,s+l);
                i_temp = Integer.parseInt(s_temp);
            
            if (i_temp > k) {
                list.add(i_temp);
            }
            }
        
        int[] answer = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            answer[j] = list.get(j);
        }
        return answer;
    }
}