class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr.length % 2 == 1 && i % 2 == 0) { // arr의 길이가 홀수이고 짝수 인덱스일 때
                answer[i] += arr[i] + n;
            } else if (arr.length % 2 == 0 && i % 2 == 1) { // arr의 길이가 짝수이고 홀수 인덱스일 때
                answer[i] += arr[i] + n;
            } else {
                answer[i] = arr[i];
            }
        }

        return answer;
    }
}
