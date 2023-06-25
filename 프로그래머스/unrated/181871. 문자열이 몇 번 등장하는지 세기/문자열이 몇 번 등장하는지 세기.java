class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int pat_len = pat.length();
        
        for (int j = 0; j <= myString.length() - pat_len; j++) {
            if (myString.substring(j, j + pat_len).equals(pat)) {
                answer++;
            }
        }
        
        return answer;
    }
}
