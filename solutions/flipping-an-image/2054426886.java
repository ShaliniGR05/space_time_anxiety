class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row = image.length;
        int col = image[0].length;
        int[][] res = new int[row][col];
        for(int i=row-1;i>=0;i--){
            int b = 0;
            for(int j=col-1;j>=0;j--){
                res[i][b] = image[i][j];
                if(res[i][b]==1){
                    res[i][b] = 0;
                }
                else{
                    res[i][b] = 1;
                }
                b++;
            }
        }
        return res;
    }
}