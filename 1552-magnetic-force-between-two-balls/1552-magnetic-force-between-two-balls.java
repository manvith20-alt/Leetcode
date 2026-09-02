class Solution {
    public int maxDistance(int[] position, int m) {

        Arrays.sort(position);

        int left = 1;
        int right = position[position.length - 1] - position[0];

        while (left < right) {

            int mid = left + (right - left + 1) / 2;

            if (possible(position, m, mid)) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    private boolean possible(int[] position, int m, int distance) {

        int count = 1;
        int lastPosition = position[0];

        for (int i = 1; i < position.length; i++) {

            if (position[i] - lastPosition >= distance) {
                count++;
                lastPosition = position[i];
            }

            if (count >= m) {
                return true;
            }
        }

        return false;
    }
}