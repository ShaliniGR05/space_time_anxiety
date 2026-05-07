class Solution {
    public int longestValidParentheses(String s) {
        int max = 0;
        Stack<Integer> res = new Stack<>();
        res.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                res.push(i);
            }
            else{
                res.pop();
                if(res.isEmpty()){
                    res.push(i);
                }
                else{
                    max = Math.max(max,i-res.peek());
                }
            }
        }
        return max;
    }
}