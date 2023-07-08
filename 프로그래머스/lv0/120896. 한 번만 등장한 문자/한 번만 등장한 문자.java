import java.util.*;

class Solution {
    public String solution(String s) {
        ArrayList<String> uniqueChars = new ArrayList<>();
        String answer = "";
        String[] ss = s.split("");

        for (int i = 0; i < ss.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < ss.length; j++) {
                if (i != j && ss[i].equals(ss[j])) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueChars.add(ss[i]);
            }
        }

        Collections.sort(uniqueChars);
        
        for (String c : uniqueChars) {
            answer += c;
        }
        
        return answer;
    }
}
