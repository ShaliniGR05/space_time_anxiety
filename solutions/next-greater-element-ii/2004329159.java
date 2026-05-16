class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int i = nums.length - 1;
        int[] ans = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        boolean second = false;
        while(i<nums.length && i>=0){
            while(!st.isEmpty() && st.peek() <= nums[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i] = st.peek();
            }
            else{
                ans[i] = -1;
            }
            st.push(nums[i]);
            i--;
            if(i < 0 && !second){
                i = nums.length - 1;
                second = true;
            }
        }
        return ans;
    }
}