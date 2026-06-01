class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int max_count = -1;
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            if(mp.get(nums[i]) > nums.length/2 && mp.get(nums[i])>max_count){
                max_count = nums[i];
                break;
            }
        }
        return max_count;
    }
}