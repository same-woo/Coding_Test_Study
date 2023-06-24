class Solution {
    public long solution(int price, int money, int count) {
        long totalCost = (long) price * (count * (count + 1)) / 2; // 등차수열의 합 공식을 이용하여 총 비용 계산
        long answer = totalCost - money; // 부족한 금액 계산
        
        return (answer >= 0) ? answer : 0; // 부족한 금액이 0 이상인 경우 해당 금액을 반환하고, 그렇지 않은 경우 0을 반환
    }
}
