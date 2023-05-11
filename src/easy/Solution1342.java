package easy;

public class Solution1342 {
    public int numberOfSteps1(int num) {
        int numberSteps = 0;
        if (num == 0) {
            return numberSteps;
        }
        for (int i = 0; i <= num; i++) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            numberSteps++;
            i = 0;
        }
        return numberSteps;
    }

    public int numberOfSteps2(int num) {
        int steps = 0;
        while (num != 0) {
            num = (num % 2 == 0) ? num / 2 : num - 1;
            steps++;
        }
        return steps;
    }

    public int numberOfSteps(int num) {
        return Integer.toBinaryString(num).length() - 1 + Integer.bitCount(num);
    }
}
