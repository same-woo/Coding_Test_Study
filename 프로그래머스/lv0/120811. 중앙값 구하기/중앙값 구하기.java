import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;

        Arrays.sort(array);

        if (array.length % 2 == 0) {
            answer = (array[array.length / 2] + array[(array.length / 2) - 1]) / 2;
        } else {
            answer = array[array.length / 2];
        }

        return answer;
    }
}
