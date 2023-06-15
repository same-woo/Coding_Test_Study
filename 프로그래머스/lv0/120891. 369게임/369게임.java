class Solution {
    public int solution(int order) {
        int answer = 0;

        String order2 = Integer.toString(order);
        String[] Array = order2.split("");
        
        for (int i = 0; i < Array.length; i++) {
            if(Array[i].equals("3") | Array[i].equals("6") | Array[i].equals("9")) {
                answer += 1;
            }
        }
        
        return answer;
    }
}