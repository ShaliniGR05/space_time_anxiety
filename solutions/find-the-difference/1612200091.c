char findTheDifference(char* s, char* t) {
    int n = strlen(s);
    int n2 = strlen(t);
    int check = 0,check2=0;
    for(int i=0;i<n;i++){
        check = check ^ s[i];
    }
    for(int i=0;i<n2;i++){
        check2 = check2 ^ t[i];
    }
    return check ^ check2;
}