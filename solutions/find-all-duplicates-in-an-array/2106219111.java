class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> res =  new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i != nums.length - 1){
            if(nums[i]==nums[i+1]){
                res.add(nums[i]);
            }
            }
        }
        return res;
    }
}