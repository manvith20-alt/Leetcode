class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            arr.add(i);
        }

        int j = 0;

        while (arr.size() > 1) {
            j = (j + k - 1) % arr.size();
            arr.remove(j);
        }

        return arr.get(0);
    }
}
