class Solution {
    public char findTheDifference(String s, String t) {
        int check1 = 0;
        for(char c : t.toCharArray()){
            check1 = check1 ^ c;
        }
        int check2 = 0;
        for(char c : s.toCharArray()){
            check2 = check2 ^ c;
        }

        return (char)(check1 ^ check2);
    }
}