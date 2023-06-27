class Solution {
    public String solution(String s) {
        String answer = "";
        char[] chars = s.toCharArray();
        int s_len = s.length() / 2;

        if (s.length() % 2 == 0) {
            answer += chars[s_len - 1];
            answer += chars[s_len];
        } else {
            answer += chars[s_len];
        }

        return answer;
    }
}
