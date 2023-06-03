class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] result = {"a", "e", "i", "o", "u"};
        
        answer = my_string;
        
        for (String character : result) {
            answer = answer.replaceAll(character, "");
        }
        
        return answer;
    }
}
