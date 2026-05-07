class Solution {
    public boolean isValid(String s) {
        Stack<Character> r =  new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                r.push(c);
            }
            else{
                if (r.isEmpty()) return false;
                char top = r.pop();
                if(c == ')' && top != '(' || c == ']' && top!= '[' || c == '}' && top != '{'){
                    return false;
                }
            }
        }
        return r.isEmpty();

    }
}