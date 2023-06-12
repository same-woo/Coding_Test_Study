class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        
        String[] Array = my_string.split("");
        
        for (int i = 0; i < my_string.length(); i++) {
            if (Array[i].equals(alp)) {
                answer += Array[i].toUpperCase();
            } else
                answer += Array[i];
        }
        return answer;
    }
}