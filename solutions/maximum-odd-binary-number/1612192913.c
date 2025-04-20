char* maximumOddBinaryNumber(char* s) {
    int count =0;
    int l = strlen(s);
    for(int i=0;i<l;i++){
        if(s[i]=='1'){
            count = count + 1;
        }
    }
    for(int i=0;i<count-1;i++){
        s[i] = '1';
    }
    for(int i=count-1;i<l-1;i++){
        s[i] = '0';
    }
    s[l-1] = '1';
    return s;
    
}