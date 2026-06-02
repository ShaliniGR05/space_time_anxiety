class Solution {
    public void rotate(int[] nums, int k) {
        int n = k % nums.length;
        int[] temp = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int new_index = (i + k) % nums.length;
            temp[new_index] = nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = temp[i];
        }
    }
}