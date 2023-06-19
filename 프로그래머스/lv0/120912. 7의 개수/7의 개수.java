class Solution {
    public int solution(int[] array) {
        int answer = 0;

        for (int num : array) {
            String[] arr = Integer.toString(num).split("");
            for (String digit : arr) {
                if (digit.equals("7")) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
