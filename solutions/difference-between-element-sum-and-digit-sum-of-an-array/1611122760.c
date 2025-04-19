int differenceOfSum(int* nums, int numsSize) {
    int sum1=0,sum2=0;
    for(int i=0;i<numsSize;i++){
        if(nums[i]/10 !=0 ){
            int temp = nums[i];
            int rem = 0;
            while(temp!=0){
                rem = temp%10;
                sum2 += rem;
                temp = temp/10;
            }
        }
        else{
            sum2 += nums[i];
        }
        sum1 += nums[i]; 
    }
    return sum1 - sum2;
}