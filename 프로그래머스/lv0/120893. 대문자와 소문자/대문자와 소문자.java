class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] Array = my_string.split("");
        
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isUpperCase(Array[i].charAt(0))) {
                answer += Array[i].toLowerCase();
            } else if (Character.isLowerCase(Array[i].charAt(0))) {
                answer += Array[i].toUpperCase();
            }
        }
        
        return answer;
    }
}
