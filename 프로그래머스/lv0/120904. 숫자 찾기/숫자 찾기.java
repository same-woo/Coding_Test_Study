class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String num2 = Integer.toString(num);
        String k2 = Integer.toString(k);
        
        String[] Array = num2.split("");
        for (int i = 0; i < Array.length; i++) {
            if (Array[i].equals(k2)) {
                answer = i+1;
                break;
            }
        }

        return answer;
    }
}
