class Solution {
    public long subArrayRanges(int[] nums) {
        long res = 0;
        for(int i=0;i<nums.length;i++){
            int max = nums[i];
            int min = nums[i];
            for(int j=i;j<nums.length;j++){
                min  = Math.min(min,nums[j]);
                max = Math.max(max,nums[j]);
                res += (long)max - min;
            }
        }
        return res;
    }
}