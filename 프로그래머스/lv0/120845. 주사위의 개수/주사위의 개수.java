class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int Min_box = 0;
        

        answer = (box[0]/n) * (box[1]/n) * (box[2]/n);
        
        return answer;
    }
}