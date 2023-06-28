class Solution {
    public int solution(String my_string) {
        String[] str_a = my_string.split(" ");
        
        int answer = 0;
        answer += Integer.parseInt(str_a[0]);
        
    for (int i =1; i < str_a.length; i++) {
        if (i % 2 != 1) {
            if (str_a[i-1].equals("+")) {
                answer += Integer.parseInt(str_a[i]);
            } else {
                answer -= Integer.parseInt(str_a[i]);
            }
        }
    }
        return answer;
    }
}
