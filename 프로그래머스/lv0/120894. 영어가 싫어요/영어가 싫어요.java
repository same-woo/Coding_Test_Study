class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        // replace 메소드 사용
        numbers = numbers.replace("zero", "0").replace("one", "1").replace("two", "2").replace("three", "3").replace("four", "4").replace("five", "5").replace("six", "6").replace("seven", "7").replace("eight", "8").replace("nine", "9");
        
        //numbers를 Long형으로 바꿔서 answer에 담아주기 
        answer = Long.parseLong(numbers);
        
        return answer;
    }
}