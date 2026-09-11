class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix.length;
        int n1 = matrix[0].length;

        int low = 0;
        int high = n * n1 - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int row = mid / n1;
            int col = mid % n1;

            int value = matrix[row][col];

            if (value == target) {
                return true;
            }
            else if (value > target) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return false;
    }
}