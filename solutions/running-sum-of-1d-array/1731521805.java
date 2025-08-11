class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int[] arr = new int[nums.length];
        int k = 1;
        arr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i+1;j++){
                sum += nums[j];
            }
            arr[k] = sum;
            sum =0;
            k++;
        }
        return arr;
    }
}