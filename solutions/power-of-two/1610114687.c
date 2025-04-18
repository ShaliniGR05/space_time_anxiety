bool isPowerOfTwo(int x) {
    long int n = x;
    if (n==0) return false;
    if(n==1) return true;
    if(((n-1 & n )== 0) && ((n+1 & n) == n)){
        return true;
    }
    return false;
}