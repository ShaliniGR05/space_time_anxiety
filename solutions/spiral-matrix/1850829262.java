class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> travel = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        int order = 0;
        while(top<=bottom &&left<=right){
            if(order==0){
                for(int i=left;i<=right;i++){
                    travel.add(matrix[top][i]);
                }
                top++;
            }
            else if(order==1){
                for(int i=top;i<=bottom;i++){
                    travel.add(matrix[i][right]);
                }
                right--;
            }
            else if(order==2){
                for(int i=right;i>=left;i--){
                    travel.add(matrix[bottom][i]);
                }
                bottom--;
            }
            else if(order==3){
                for(int i=bottom;i>=top;i--){
                    travel.add(matrix[i][left]);
                }
                left++;
            }

            order = (order + 1) % 4;

        }
        return travel;
    }
}