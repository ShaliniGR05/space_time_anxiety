class StockSpanner {

    class pair{
        int num;
        int span;
        pair(int num,int span){
            this.num = num;
            this.span = span;
        }
    }
    Stack<pair> st;
    public StockSpanner() {
        st = new Stack<>();   
    }
    
    public int next(int price) {

        int span = 1;
        while(!st.isEmpty() && price >= st.peek().num){
            span  += st.pop().span;
        }
        st.push(new pair(price,span));

        return span;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */