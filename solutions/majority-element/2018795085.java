class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int max = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[j]==nums[i]){
                    count += 1;
                }
            }
            if(count>nums.length/2 && count>max){
                max  = nums[i];
            }
            count = 0;
        }
        return max;
    }
}