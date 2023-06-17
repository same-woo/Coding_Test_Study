class Solution {
    public int solution(String s) {
        int answer = 0;
        int result = 0;
        String[] ss = s.split(" ");
        
        for (int i = 0; i < ss.length; i++) {
            if (ss[i].equals("Z")) {
                result -= Integer.parseInt(ss[i - 1]);
                continue;
            }
            result += Integer.parseInt(ss[i]);
        }
        return result;
    }
}
