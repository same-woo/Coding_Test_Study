class Solution {
    public int solution(int[] num_list) {
        int answer1 = 0;
        int answer2 = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                answer1 += num_list[i];
            } else {
                answer2 += num_list[i];
            }
        }
        
        if (answer1 > answer2) {
            return answer1;
        } else {
            return answer2;
        }
    }
}
