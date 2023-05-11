package easy;

import java.math.BigInteger;

public class Solution67 {

    public static void main(String[] args) {
        System.out.println(new Solution67().addBinary("101000001001001101100100000" +
                        "10101111011011001101110111111111101000000101111001110001111100001101",
                "1101010010111011100011111001100010101000011010111010100000110110" +
                        "11001011101111001100000011011110011"));
        System.out.println(new Solution67().addBinary("11", "1"));
    }

    public String addBinary(String a, String b) {
        BigInteger number = new BigInteger(String.valueOf(a), 2);
        BigInteger number2 = new BigInteger(String.valueOf(b), 2);
        number2 = number2.add(number);
        return number2.toString(2);
    }
}
