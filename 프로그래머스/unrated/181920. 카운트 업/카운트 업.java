class Solution {
    public int[] solution(int start, int end) {
        int range = end - start + 1;
        int[] answer = new int[range];
        
        for (int i = 0; i < range; i++) {
            answer[i] += start++;
        }
        
        return answer;
    }
}