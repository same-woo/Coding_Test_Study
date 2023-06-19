import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array); // 배열 정렬
        
        int answer = array[0]; // 초기값은 첫 번째 원소로 설정
        int minDiff = Math.abs(array[0] - n); // 초기값은 첫 번째 원소와의 차이로 설정
        
        for (int i = 1; i < array.length; i++) {
            int diff = Math.abs(array[i] - n); // 현재 원소와 n의 차이 계산
            
            if (diff < minDiff) { // 현재 원소와 n의 차이가 최소값보다 작으면
                answer = array[i]; // 현재 원소를 정답으로 설정
                minDiff = diff; // 최소값을 갱신
            }
        }
        
        return answer;
    }
}
