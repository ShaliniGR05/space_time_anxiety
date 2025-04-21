void sortColors(int* nums, int numsSize) {
    int zc = 0,oc = 0;
    for(int i=0;i<numsSize;i++){
        if(nums[i]==0){
            zc ++;
        }
        if(nums[i]==1){
            oc++;
        }
    }
    for(int i=0;i<numsSize;i++){
        if(i<zc) nums[i] = 0;
        else if(i<zc+oc) nums[i] =1;
        else nums[i] = 2;
    }
}