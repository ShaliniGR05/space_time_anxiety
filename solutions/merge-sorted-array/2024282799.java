class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for(int i=m;i<m+n;i++){
                nums1[i] = nums2[j];
                j++;
        }
        merge_arr(nums1,0,m-1,m+n-1);
    }
    public void merge_arr(int arr[],int lb,int mid,int ub){
        int i = lb;
        int j = mid + 1;
        int k = 0;
        int[] b = new int[ub - lb + 1];
        while(i<=mid && j<=ub){
            if(arr[i] <= arr[j]){
                b[k] = arr[i];
                i++;
            }
            else{
                b[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            b[k] = arr[i];
            i++;
            k++;
        }
        while(j<=ub){
            b[k] = arr[j];
            j++;
            k++;
        }
        for(int t=0;t<b.length;t++){
            arr[lb+t] = b[t];
        }
    }
}