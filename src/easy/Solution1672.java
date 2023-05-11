package easy;

import java.util.Arrays;

public class Solution1672 {
    public int maximumWealth(int[][] accounts) {
        int maxRichest = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sumRow = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                sumRow += accounts[i][j];
            }
            System.out.println("Sum of " + (i + 1) + " row: " + sumRow);

            maxRichest = Math.max(maxRichest, sumRow);
        }
        return maxRichest;
    }

    public int maximumWealth1(int[][] accounts) {
        int[] sums = Arrays.stream(accounts)
                .mapToInt(row -> Arrays.stream(row).sum())
                .toArray();
        return Arrays.stream(sums).max().getAsInt();
    }
}