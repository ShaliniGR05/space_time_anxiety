int reverse(int x){
    if(x==0){
        return 0;
    }
    int n = x;
    int rev=0,rem = 0;
    while(n!=0){
        rem = n % 10;
        if(rev>INT_MAX/10 || rev < INT_MIN/10){
            return 0;
        }
        rev = rem + rev*10;
        n = n/10;
    }
    return rev;
}