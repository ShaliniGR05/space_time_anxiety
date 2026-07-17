class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] res = new int[255];
        for(char ch : magazine.toCharArray()){
            res[ch]++;
        }
        for(char ch : ransomNote.toCharArray()){
            res[ch]--;
            if(res[ch] <0) return false;   
        }
        return true;
    }
}
