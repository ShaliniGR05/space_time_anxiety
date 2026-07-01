class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i += 2*k){
            int end = Math.min(i+k,s.length());
            result.append(reverse(s.substring(i,end)));
            if(end < s.length()){
                int nextend = Math.min(i + 2 * k ,s.length());
                result.append(s.substring(end,nextend));
            }
        }
        return result.toString();
    }
    public String reverse(String str){
        char[] arr = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;
        while(left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);

    }
}