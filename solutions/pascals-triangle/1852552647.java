class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int r=0;r<numRows;r++){
            List<Integer> curr = new ArrayList<Integer>();
            curr.add(1);
            if(r>0){
                List<Integer> prev = res.get(r-1);
                for(int c=1;c<r;c++){
                    int val = prev.get(c-1)+prev.get(c);
                    curr.add(val);
                }
                curr.add(1);
            }
            res.add(curr);
        }
        return res;
    }
}