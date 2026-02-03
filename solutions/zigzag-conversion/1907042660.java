class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows>=s.length()){
            return s;
        }

        StringBuilder[] val = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            val[i] = new StringBuilder();
        }
        int curr = 0;
        boolean dir = false;
        for(char c : s.toCharArray()){
            val[curr].append(c);
            if(curr==0 || curr == numRows-1){
                dir = !dir;
            }
            curr += dir? 1 : -1;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder v: val){
            res.append(v);
        }
        return res.toString();
    }
}