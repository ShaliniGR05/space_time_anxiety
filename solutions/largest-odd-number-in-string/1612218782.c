char* largestOddNumber(char* num) {
    int n = strlen(num);
    for(int i = n;i>=0;i--){
        if((num[i] - '0') % 2 == 1){
            num[i+1] = '\0';
            return num;
        }
    }
    return "";
}