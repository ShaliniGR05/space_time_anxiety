void moveZeroes(int* nums, int numsSize) {
    int ni=0;
    for(int i=0;i<numsSize;i++){
        if(nums[i]!=0){
            int t = nums[i];
            nums[i] = nums[ni];
            nums[ni] = t; 
            ni++;
        }
    }
}