class Solution {
    public double minimumAverage(int[] nums) {
        float[] avgarr = new float[nums.length/2];
        boolean[] used = new boolean[nums.length];
        for(int i=0;i<nums.length/2;i++){
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int minindex = -1, maxindex = -1;
            for(int j=0;j<nums.length;j++){
                if(!used[j]){
                if(nums[j]>max){
                    max = nums[j];
                    maxindex = j;
                }
                if(nums[j]<min){
                    min = nums[j];
                    minindex = j;
                }
              }
            }
            float avg = (min+max)/2.0f;
            avgarr[i] = avg;
            used[minindex] =  true;
            used[maxindex] = true;
        }
        float ans = avgarr[0];
        for(int i=0;i<avgarr.length;i++){
            if(avgarr[i]<ans){
                ans = avgarr[i];
            }
        }
        return ans;
        }
    }