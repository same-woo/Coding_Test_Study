class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int sum = 0;
        String x_str = Integer.toString(x);
        
        String [] x_len = x_str.split("");
        
        
        
        for(int i = 0; i < x_len.length; i++) {
            sum += Integer.parseInt(x_len[i]);
        }
        
        if (x % sum == 0) {
            answer = true;
        }
        
        
        return answer;
    }
}