import java.math.BigInteger;

class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger numberOne=new BigInteger(num1) ;
        BigInteger numberTwo=new BigInteger(num2) ;

        BigInteger sum= numberOne.add(numberTwo) ;

        return sum.toString() ;
    }
}
