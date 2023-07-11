class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int patLength = pat.length(); // pat의 길이 지정
        int myStringLength = myString.length(); // myString의 길이 지정

        for (int i = myStringLength - 1; i >= 0; i--) { // mystring의 길이 뒤에서부터.
            String substr = myString.substring(0, i + 1); // substr을 뒤에서부터 생성한다. 
            if (substr.endsWith(pat)) { // 만약 생성된 문자열의 뒤에 'pat'이 포함된다면 
                answer = substr; //answer을 리턴한다.
                break;
            }
        }

        return answer;
    }
}