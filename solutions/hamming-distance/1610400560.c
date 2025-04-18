int hammingDistance(int x, int y) {
    int a = x ^ y;
    int count=0;
    while(a){
        a = ((a-1)&a);
        count += 1; 
    }
    return count;
}