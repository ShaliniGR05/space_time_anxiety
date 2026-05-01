class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                arr1.add(nums[i]);
            }
            else arr2.add(nums[i]);
        }
        arr2.addAll(arr1);
        for(int i=0;i<nums.length;i++){
            nums[i] = arr2.get(i);
        }
    }
}