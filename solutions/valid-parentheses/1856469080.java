class Solution {
    public boolean isValid(String s) {
        Stack<Character> res = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                res.push(c);
            }
            else{
                if(res.isEmpty()) return false;
                char top = res.pop();
                if(c=='}' && top!= '{' || c==']' && top!= '[' || c == ')' && top!='('){
                    return false;
                }
            }
        }
        return res.isEmpty();
    }
}