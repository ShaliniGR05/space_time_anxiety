int countConsistentStrings(char * allowed, char ** words, int wordsSize){
    int map[26] = {0};
    for(int i=0;allowed[i];i++){
        map[allowed[i] - 'a'] = 1;
    }
    int count = 0;
    for(int i=0;i<wordsSize;i++){
        int check = 1;
        for(int j=0;words[i][j];j++){
            if(map[words[i][j] - 'a']==0){
                check = 0;
                break;
            }
        }
        if(check){
            count += 1;
        }
    }
    return count;
}