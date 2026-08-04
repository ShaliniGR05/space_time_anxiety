class Solution {
    public int pivotIndex(int[] nums) {
        int mid = 0;
        while(mid < nums.length){
            int leftsum = 0;
            int rightsum = 0;
            for(int i=0;i<mid;i++){
                leftsum += nums[i]; 
            }
            for(int i=mid+1;i<nums.length;i++){
                rightsum += nums[i];
            }
            if(leftsum == rightsum){
                return mid;
            }
            mid++;
        }
        return -1;
    }
}