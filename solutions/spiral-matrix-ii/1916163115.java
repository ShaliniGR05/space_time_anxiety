class Solution {
    public int[][] generateMatrix(int n) {
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;
        int order = 0;
        int[][] matrix = new int[n][n];
        int j = 1;
        while(top<=bottom && left<=right){
            if(order==0){
                for(int i=left;i<=right;i++){
                    matrix[top][i] = j;
                    j = j + 1;
                }
                top++;
            }
            else if(order==1){
                for(int i=top;i<=bottom;i++){
                    matrix[i][right] = j;
                    j = j + 1;
                }
                right--;
            }
            else if(order==2){
                for(int i=right;i>=left;i--){
                    matrix[bottom][i] = j;
                    j = j + 1;
                }
                bottom--;
            }
            else if(order==3){
                for(int i=bottom;i>=top;i--){
                    matrix[i][left] = j;
                    j = j + 1;
                }
                left++;
            }
            order = (order + 1)%4;
        }
        return matrix;
    }
}