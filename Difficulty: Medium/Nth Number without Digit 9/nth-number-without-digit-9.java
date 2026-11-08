import java.math.BigInteger;

class Solution {
    public String findNth(String n) {
        BigInteger num = new BigInteger(n);
        return num.toString(9);
    }
}