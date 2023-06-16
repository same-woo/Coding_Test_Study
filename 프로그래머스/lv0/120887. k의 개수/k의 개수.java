class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String q = "";
        String kk = Integer.toString(k);
        
        for (int s = i; s <= j; s++) {
            q = Integer.toString(s);
            String[] q2 = q.split("");
            
            for (int s2 = 0; s2 < q2.length; s2++) {
                if (q2[s2].equals(kk)) {
                                    answer += 1;
                }
            }
        }
                                        return answer;   
            }
 
        }
        
