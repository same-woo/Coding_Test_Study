import java.math.BigInteger;

class Solution {
    public int solution(String number) {
        BigInteger num = new BigInteger(number);
        BigInteger nine = new BigInteger("9");
        BigInteger remainder = num.mod(nine);
        return remainder.intValue();
    }
}
