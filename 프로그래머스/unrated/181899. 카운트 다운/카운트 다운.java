class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[start - end + 1];
        int len = start - end + 1;
        for(int i = 0; i < len; i++)
            answer[i] = start--;
        return answer;
    }
}