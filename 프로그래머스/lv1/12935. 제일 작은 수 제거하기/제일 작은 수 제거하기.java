class Solution {
    public int[] solution(int[] arr) {
        if (arr.length <= 1) {
            return new int[] {-1}; // 배열이 빈 경우나 길이가 1인 경우 -1을 가진 배열 반환
        }

        int min = Integer.MAX_VALUE; // 최솟값을 찾기 위한 초기값 설정

        // 배열에서 최솟값 찾기
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }

        int[] answer = new int[arr.length - 1];
        int index = 0;

        // 최솟값을 제외한 나머지 수를 새로운 배열에 저장
        for (int num : arr) {
            if (num != min) {
                answer[index] = num;
                index++;
            }
        }

        return answer;
    }
}
