int averageValue(int* nums, int numsSize) {
    int count=0,sum=0;
    for(int i=0;i<numsSize;i++){
        if(nums[i]%2==0 && nums[i]%3==0){
            sum += nums[i]; 
            count += 1;
        }
    }
    if (count==0) return 0;
    return sum/count;
    
}