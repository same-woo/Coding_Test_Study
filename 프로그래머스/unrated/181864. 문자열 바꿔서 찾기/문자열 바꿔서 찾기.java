class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String[] Array = myString.split("");
        String[] Array2 = pat.split("");
        
        for (int i=0; i < Array.length; i++) {
            if (Array[i].equals ("A")) {
                Array[i] = "B";
            } else if (Array[i].equals ("B")) {
                Array[i] = "A";
        }
        }
        String modifiedString = String.join("", Array);
        if (modifiedString.contains(pat)) {
            answer = 1;
        } else {
            answer = 0;
        }
        
        
        return answer;
    }
}