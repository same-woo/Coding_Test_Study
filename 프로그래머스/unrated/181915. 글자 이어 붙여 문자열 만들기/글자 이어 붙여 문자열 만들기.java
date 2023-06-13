class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        String[] Arrays = my_string.split("");
        
        for (int i = 0; i < index_list.length; i++) {
            
            answer += Arrays[index_list[i]];
        }
        
        return answer;
    }
}