class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
        return 0;
    }
    int numRows = triangle.size();
    int[] dp = new int[numRows];
    for (int i = 0; i < numRows; i++) {
        dp[i] = triangle.get(numRows - 1).get(i);
    }
    for (int row = numRows - 2; row >= 0; row--) {
        List<Integer> currentRow = triangle.get(row);
        for (int i = 0; i < currentRow.size(); i++) {
            dp[i] = Math.min(dp[i], dp[i + 1]) + currentRow.get(i);
        }
    }
    return dp[0];
    }
}