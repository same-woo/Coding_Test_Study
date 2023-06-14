class Solution {
    public int solution(int a, int b) {
        String ab = "";
        String ba = "";
        
        ab = Integer.toString(a) + Integer.toString(b);
        ba = Integer.toString(b) + Integer.toString(a);
        
        int ab2 = Integer.parseInt(ab);
        int ba2 = Integer.parseInt(ba);
        
        if (ab2 > ba2) {
            return ab2;
        } else if (ab2 < ba2) {
            return ba2;
        } else {
            return ab2;
        }
    }
}
