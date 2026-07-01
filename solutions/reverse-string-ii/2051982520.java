class Solution {
    public String reverseStr(String s, int k) {
       char[] arr = s.toCharArray();
       int i = 0;
       int j = k - 1;
       while(i<arr.length){
        if(j>=arr.length){
            j = arr.length - 1;
        }
        reverse(arr,i,j);
        i = i + 2*k;
        j = i + k - 1;
       }
       return new String(arr);
    }
    public void reverse(char[] arr,int left,int right){
        while(left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }
}