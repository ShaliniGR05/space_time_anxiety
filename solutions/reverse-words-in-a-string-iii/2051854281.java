class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        int i=0;
        for(String word : str){
            int left = 0;
            int right = word.length() - 1;
            char[] arr = word.toCharArray();
            while(left<right){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            str[i] = new String(arr);
            i++;
        }
        return String.join(" ",str);
    }
}