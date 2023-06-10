class Solution {
    public int solution(int n, String control) {
        int answer = n;
        String[] controlArray = control.split("");

        for (int i = 0; i < controlArray.length; i++) {
            if (controlArray[i].equals("w")) {
                answer += 1;
            } else if (controlArray[i].equals("s")) {
                answer -= 1;
            } else if (controlArray[i].equals("d")) {
                answer += 10;
            } else if (controlArray[i].equals("a")) {
                answer -= 10;
            }
        }

        return answer;
    }
}
