class Solution {
    public int solution(int chicken) {
        int coupon = chicken; // 시켜먹은 치킨 수를 쿠폰으로 초기화
        int serviceChicken = 0; // 서비스 치킨 수
        
        while (coupon >= 10) {
            int serviceCount = coupon / 10; // 현재 보유한 쿠폰으로 받을 수 있는 서비스 치킨 수
            serviceChicken += serviceCount; // 서비스 치킨 수 누적
            coupon = coupon % 10 + serviceCount; // 남은 쿠폰 수 계산
        }
        
        return serviceChicken;
    }
}
