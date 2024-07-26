class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i, j;
        int n = nums.length;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
         throw new IllegalArgumentException("No two sum solution");
    }
}
