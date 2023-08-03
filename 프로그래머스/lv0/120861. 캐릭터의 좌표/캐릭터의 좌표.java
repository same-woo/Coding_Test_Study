class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int max_width = board[0]/2;
        int max_hight = board[1]/2;
        
        for (int i = 0; i < keyinput.length; i++) {
                 if(keyinput[i].equals("left")) {
                    answer[0] -= (answer[0]>-(max_width)? 1:0);
                } else if (keyinput[i].equals("right")) {
                    answer[0] += (answer[0]<(max_width)? 1:0);
                } else if (keyinput[i].equals("up")) {
                    answer[1] += (answer[1]<(max_hight)? 1:0);
                } else if (keyinput[i].equals("down")) {
                    answer[1] -= (answer[1]>-(max_hight)? 1:0);    
                }
        }
                return answer;
    }
}