class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String[] str = my_string.split("");

        for (int i = 0; c + i * m <= str.length; i++) {
            answer += str[(c + i * m)-1];
        }

        return answer;
    }
}
