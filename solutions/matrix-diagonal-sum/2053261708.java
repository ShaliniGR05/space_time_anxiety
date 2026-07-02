class Solution {
    public int diagonalSum(int[][] mat) {
        int row = mat.length-1;
        int col = mat[0].length-1;
        int sum = 0;
        for(int i=0;i<=row;i++){
            for(int j=0;j<=col;j++){
                if(i==j || (i + j) == col){
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}