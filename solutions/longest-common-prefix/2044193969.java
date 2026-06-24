class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        String res = strs[0];
        for(int i=0;i<res.length();i++){
            char ch = res.charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() || strs[j].charAt(i) !=ch){
                    return res.substring(0,i);
                }
            }
        }
        return res;
    }
}