import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.trim().split("x");
        ArrayList<String> resultList = new ArrayList<>();

        for (String str : answer) {
            if (!str.isEmpty()) {
                resultList.add(str);
            }
        }

        String[] result = new String[resultList.size()];
        resultList.toArray(result);
        Arrays.sort(result);

        return result;
    }
}
