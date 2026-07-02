class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if((r*c) != (m * n)){
            return mat;
        }
        int[][] res = new int[r][c];
        int newr = 0;
        int newc = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[newr][newc] = mat[i][j];
                newc++;
                if(newc==c){
                    newc = 0;
                    newr++;
                }
            }
        }
        return res;

    }
}