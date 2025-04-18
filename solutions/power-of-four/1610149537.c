bool isPowerOfFour(int x) {
    long int n = x;
    if(n==0) return false;
    if(n==1) return true;
    if((n&n-1)==0 && (n&n+1)==n && (n%3==1)){
        return true;
    }
    return false;
    
}