void sortColors(int* nums, int numsSize) {
    int zi = 0,ti = numsSize-1;
    int i = 0;
    while(i<=ti){
        if(nums[i]==0){
            int t = nums[i];
            nums[i] = nums[zi];
            nums[zi] = t;
            zi++;
            i++;
        }
        else if(nums[i]==2 && i<=ti){
            int t = nums[i];
            nums[i] = nums[ti];
            nums[ti] = t;
            ti--;
        }
        else{
            i++;
        }
    }
}