class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> cur = new ArrayList<>();
            cur.add(1);
            if(i>0){
                List<Integer> row = res.get(i-1);
                for(int a=1;a<i;a++){
                    int val = row.get(a) + row.get(a-1);
                    cur.add(val);
                }
                cur.add(1);
            }
            
            res.add(cur);
        }
        return res.get(rowIndex);
    }
}