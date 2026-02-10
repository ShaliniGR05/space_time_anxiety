class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int area = 0;
        int max = Integer.MIN_VALUE;
        while(l<r){
            area = Math.min(height[l],height[r]) * (r - l);
            if(area>max){
                max = area;
            }
            if(height[l]>height[r]){
                r--;
            }
            else{
                l++;
            }
        }
        return max;
    }
}

//Brute Force => O(n^2)
// class Solution {
//     public int maxArea(int[] height) {
//         int max = Integer.MIN_VALUE;
//         int now = 0;
//         for(int i=0;i<height.length;i++){
//             for(int j=i+1;j<height.length;j++){
//                 now = Math.min(height[i],height[j])* (j-i);
//                 if(now>max){
//                     max = now;
//                 }
//             }
//         }
//         return max;
//     }
// }