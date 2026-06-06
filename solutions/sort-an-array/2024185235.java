class Solution {
    public int[] sortArray(int[] arr) {
        merge_sort(arr,0,arr.length-1);
        return arr;
    }
    public void merge_sort(int arr[], int lb, int ub){
        if(lb < ub){
            int mid = lb + (ub - lb)/2;
            merge_sort(arr,lb,mid);
            merge_sort(arr,mid+1,ub);
            merge(arr,lb,mid,ub);
        }
    }
    public void merge(int arr[], int lb, int mid, int ub){
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
            k++;
            i++;
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