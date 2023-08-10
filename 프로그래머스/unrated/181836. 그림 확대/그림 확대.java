import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> answerList = new ArrayList<>();
        for (String row : picture) {
            StringBuilder enlargedRow = new StringBuilder();
            for (char pixel : row.toCharArray()) {
                for (int i = 0; i < k; ++i) {
                    enlargedRow.append(pixel);
                }
            }
            for (int i = 0; i < k; ++i) {
                answerList.add(enlargedRow.toString());
            }
        }
        String[] answer = new String[answerList.size()];
        answer = answerList.toArray(answer);
        return answer;
    }
}