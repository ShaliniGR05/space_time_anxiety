bool hasAlternatingBits(int x) {
    long int n = x;
    n = n ^ (n>>1);
    return ((n & (n+1)) == 0);
}