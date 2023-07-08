import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        List<Integer> prime = new ArrayList<>();
        int count = 0;
        
        // n의 약수 찾기
        for(int i=2; i<=n; i++){
            if(n%i == 0){
                list.add(i);
            }            
        }
        
        // n의 약수 중에서 소수 찾기
        for(int i=0; i<list.size(); i++){
            for(int j=2; j<=n; j++){
                if(list.get(i)%j == 0){
                    count += 1;
                }
            } 
            // 약수가 자신 하나라면
            if(count == 1){
                prime.add(list.get(i));
            }
            count = 0;
            
        }
        
        int[] answer = new int[prime.size()];
        // list의 값들을 answer배열에 넣어줌
        for(int i=0; i<answer.length; i++){
            answer[i] = prime.get(i);
        }
        return answer;
    }
}