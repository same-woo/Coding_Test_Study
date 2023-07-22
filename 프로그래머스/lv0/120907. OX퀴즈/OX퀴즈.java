class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] str = quiz[i].split(" ");
            int str_1 = Integer.parseInt(str[0]);
            int str_2 = Integer.parseInt(str[2]);
            int str_3 = Integer.parseInt(str[4]);

            char operator = str[1].charAt(0);

            if (operator == '+') {
                if (str_1 + str_2 == str_3) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else if (operator == '-') {
                if (str_1 - str_2 == str_3) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else if (operator == '*') {
                if (str_1 * str_2 == str_3) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else if (operator == '/') {
                if (str_1 / str_2 == str_3) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }

        return answer;
    }
}
