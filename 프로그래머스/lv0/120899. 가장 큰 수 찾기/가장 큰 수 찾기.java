class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 0;
        
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                answer[0] = array[i];
                answer[1] = i;
            }
         }
        
        
        return answer;
    }
}