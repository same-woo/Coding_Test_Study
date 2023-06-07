class Solution {
    public int solution(int[] numbers, int n) {
        int result = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
            if (n < result) {
                return result; // n보다 크거나 같은 값이면 해당 값을 반환
            }
        }
        
        return result; // 모든 숫자를 더한 결과 반환
    }
}
