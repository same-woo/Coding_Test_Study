class Solution {
	public String solution(String myString) {
        StringBuilder answer = new StringBuilder(myString);
        for (int i =0 ; i < myString.length(); i++) {
            if (answer.toString().charAt(i) < 'l') {
                answer.setCharAt(i, 'l');
            } 
        }
        return answer.toString();
    }
}