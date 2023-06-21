class Solution {
    public int solution(String binomial) {
        String[] elements = binomial.split(" ");

        int a = Integer.parseInt(elements[0]);
        int b = Integer.parseInt(elements[2]);
        char operator = elements[1].charAt(0);

        int result = 0;

        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
        }

        return result;
    }
}
