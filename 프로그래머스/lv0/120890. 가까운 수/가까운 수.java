import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int temp = 100;
        
        Arrays.sort(array);
        for (int i=0; i < array.length; i++) {
            if (temp > Math.abs(array[i] - n)) {
                temp = Math.abs(array[i] - n);
                answer = array[i];
            }   
            
        }
        
        return answer;
    }
}