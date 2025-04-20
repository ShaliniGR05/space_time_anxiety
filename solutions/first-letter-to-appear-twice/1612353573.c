char repeatedCharacter(char* s) {
    int freq[26] = {0};
    for(int i=0;s[i];i++){
        int index = s[i] - 'a';
        freq[index] += 1; 
        if(freq[index]==2){
            return s[i];
        }
    }
    return ' ';
}