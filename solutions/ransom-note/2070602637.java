class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] res = new int[26];
        for(char ch : magazine.toCharArray()){
            res[ch -'a']++;
        }
        for(char ch : ransomNote.toCharArray()){
            if(--res[ch - 'a'] < 0) return false;   
        }
        return true;
    }
}
