class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                str.append(Character.toLowerCase(ch));
            }
        } 
        if(str.toString().equals(sb.toString())){
            return true;
        }
        return false;
    }
}