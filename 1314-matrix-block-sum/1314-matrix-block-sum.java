class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;

        int[][] prefix = new int[m + 1][n + 1];

        // Build prefix sum
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                prefix[i][j] = mat[i - 1][j - 1]
                        + prefix[i - 1][j]
                        + prefix[i][j - 1]
                        - prefix[i - 1][j - 1];
            }
        }

        int[][] answer = new int[m][n];

        // Calculate block sum for every cell
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int top = Math.max(0, i - k);
                int bottom = Math.min(m - 1, i + k);

                int left = Math.max(0, j - k);
                int right = Math.min(n - 1, j + k);

                // Convert mat coordinates to prefix coordinates
                top++;
                bottom++;
                left++;
                right++;

                answer[i][j] = prefix[bottom][right]
                        - prefix[top - 1][right]
                        - prefix[bottom][left - 1]
                        + prefix[top - 1][left - 1];
            }
        }

        return answer;
    }
}