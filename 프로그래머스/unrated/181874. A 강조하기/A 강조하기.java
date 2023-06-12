class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < myString.length(); i++) {
            char ch = myString.charAt(i);
            
            if (ch == 'a' || ch == 'A') {
                answer.append('A');
            } else if (Character.isUpperCase(ch)) {
                answer.append(Character.toLowerCase(ch));
            } else {
                answer.append(ch);
            }
        }
        
        return answer.toString();
    }
}
