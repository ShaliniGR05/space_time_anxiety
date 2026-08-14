class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]-1]++;   
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(arr[i]>1){
                res.add(i+1);
            }
        }

        return res;
    }
}