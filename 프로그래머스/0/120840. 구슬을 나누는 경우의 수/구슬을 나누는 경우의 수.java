import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {

        BigInteger bfac = new BigInteger("1");
        BigInteger sfac = new BigInteger("1");
        BigInteger mfac = new BigInteger("1");

        for(int i = 1; i <= balls; i++){
            bfac = bfac.multiply(BigInteger.valueOf(i));
        }

        for(int i = 1; i <= share; i++){
            sfac = sfac.multiply(BigInteger.valueOf(i));
        }

        for(int i = 1; i <= balls - share; i++){
            mfac = mfac.multiply(BigInteger.valueOf(i));
        }

        int answer = bfac.divide(mfac.multiply(sfac)).intValue();

        return answer;
    }
}