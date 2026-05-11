class MinStack {

    class pair{
        int val;
        int min;
        pair(int val,int min){
            this.val = val;
            this.min = min;
        }
    }
    Stack<pair> ls;
    public MinStack() {
        ls = new Stack<>();
    }
    
    public void push(int val) {
        if(ls.isEmpty()){
            ls.push(new pair(val,val));
        }
        else{
            int currm = Math.min(val,ls.peek().min);
            ls.push(new pair(val, currm));
        }
    }
    
    public void pop() {
        ls.pop();
    }
    
    public int top() {
        return ls.peek().val;
    }
    
    public int getMin() {
        return ls.peek().min;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */