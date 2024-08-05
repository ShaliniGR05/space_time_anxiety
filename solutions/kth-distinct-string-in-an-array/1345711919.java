class Solution {
    public String kthDistinct(String[] arr, int k) {
        int n = arr.length;
        int check = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            check = 1;
            for(int j=0;j<n;j++){
               if (i != j && arr[i].equals(arr[j])) {
                    check = 0; 
                    break;
                }
            }
            if(check==1){
                count++;
            }
            if(count==k){
                return arr[i];
            }
        }
        return "";
    }
}