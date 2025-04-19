int maxSubArray(int* nums, int numsSize) {
    int max = nums[0];
    int sum = nums[0];
    for(int i=1;i<numsSize;i++){
        if(sum+nums[i]>nums[i]){
            sum += nums[i];
        }
        else{
            sum = nums[i];
        }
        if(max<sum){
            max = sum;
        }
    }
    return max;
    
}