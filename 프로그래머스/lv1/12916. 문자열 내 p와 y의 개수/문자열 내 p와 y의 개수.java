class Solution {
    boolean solution(String s) {
        boolean answer = false;
        String ss = s.toLowerCase();
        int p =0;
        int y =0;
        
        StringBuilder sb = new StringBuilder();
        
        for (char c : ss.toCharArray()) {
            if (String.valueOf(c).equals("p")) {
                p++;
            } else if (String.valueOf(c).equals("y")) {
                y++;
            }
        }
        
        if (p == y | p == 0 & y == 0) {
            answer = true;
        }
        

        return answer;
    }
}