class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] temp = new int[strArr.length];
        
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 1; j <= strArr.length; j++) {
                if (strArr[i].length() == j) {
                    temp[j]++;
                }
            }
        }
        
        int max = 0;
        for (int j = 1; j < strArr.length; j++) {
            if (temp[j] > max) {
                max = temp[j];
            }
        }
        
        answer = max;
        return answer;
    }
}
