class Solution {
    public int[] solution(int n, int m) {
        int max = Math.max(n, m); // a
	int min = Math.min(n, m); // b
			
	// 최대 공약수
	while(min != 0) {  // c
		int r = max % min;  
		max = min;  
		min = r; 
	}
		
	//최소 공배수 = 두수의 곱 / 최대공약수
	int gcd = n * m / max;   // d
        
	int[] answer = {max, gcd};
	return answer;
    }
}