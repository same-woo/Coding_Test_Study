class Solution {
    public String solution(int age) {
        String answer = "";
        String age_str = Integer.toString(age);
        String[] array = age_str.split("");
        
        for (int i = 0; i < array.length; i++) {
            int num = Integer.parseInt(array[i]);
            char ch = (char) ('a' + num);
            answer += ch;
        }
        
        return answer;
    }
}
