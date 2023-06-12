class Solution {
    public String solution(String rny_string) {
        String answer = "";
        
        String[] Arrays = rny_string.split("");
        
        for (int i = 0; i < rny_string.length(); i++) {
            if (Arrays[i].equals("m")) {
                answer += "rn";
            } else 
                answer += Arrays[i];
        }
        
            return answer;
    }
}