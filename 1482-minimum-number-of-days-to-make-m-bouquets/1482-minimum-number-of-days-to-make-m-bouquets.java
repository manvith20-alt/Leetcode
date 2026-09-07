class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int low = 1;
        int high = 0;
        for (int day : bloomDay) {
            high = Math.max(high, day);
        }

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (possible(mid, bloomDay, m, k)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private boolean possible(int day, int[] bloomDay, int m, int k) {

        int flowers = 0;
        int bouquets = 0;

        for (int bloom : bloomDay) {

            if (bloom <= day) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }

            } else {
                flowers = 0;
            }

            if (bouquets >= m) {
                return true;
            }
        }
        return false;
    }
}