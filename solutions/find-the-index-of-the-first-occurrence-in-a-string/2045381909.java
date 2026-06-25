class Solution {
    public int strStr(String haystack, String needle) {
        int win = needle.length();
        for(int i=0;i+win <= haystack.length();i++){
            if(haystack.substring(i,i+win).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}