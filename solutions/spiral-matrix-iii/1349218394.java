class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] result = new int[rows * cols][2]; 
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0}; 
        int dir = 0; 
        int r = rStart, c = cStart; 
        int step = 1; 
        int len = 0; 

        result[len++] = new int[]{r, c}; 

        while (len < rows * cols) {
            for (int i = 0; i < 2; i++) { 
                for (int j = 0; j < step; j++) {
                    r += dr[dir];
                    c += dc[dir];

                    if (r >= 0 && r < rows && c >= 0 && c < cols) {
                        result[len++] = new int[]{r, c};
                    }
                }
                dir = (dir + 1) % 4;
            }
            step++; 
        }

        return result;
    }
}
 
