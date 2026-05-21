class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        while(right>=left){
            mid = (left + right)/2;
            if (arr[mid] > arr[mid+1]) right--;
            else left++; 
        }
        return mid;
    }
}