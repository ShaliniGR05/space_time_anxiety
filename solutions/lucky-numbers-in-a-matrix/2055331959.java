class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i=0;i<row;i++){
            int min = matrix[i][0];
            int colidx = 0;
            for(int j=1;j<col;j++){
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                    colidx = j;
                }
            }
            boolean lucky = true;
            for(int k=0;k<row;k++){
                if(matrix[k][colidx] > min){
                    lucky = false;
                    break;
                }
            }
            if(lucky){
                res.add(min);
            }
        }
        return res;
    }
}