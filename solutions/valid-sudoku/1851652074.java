class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] box = new HashSet[9];
        for(int i=0;i<9;i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char val = board[i][j];
                if(val == '.') continue;
                if(!rows[i].add(val)) return false;
                if(!cols[j].add(val)) return false;
                int boxindex = (i/3)*3 + (j/3);
                if(!box[boxindex].add(val)) return false;
            }
        }
        return true;
    }
}