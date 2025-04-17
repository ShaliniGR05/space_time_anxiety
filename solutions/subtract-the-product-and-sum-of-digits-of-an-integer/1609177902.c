int subtractProductAndSum(int n) {
    int sum = 0,pro = 1;
    int rem = 0;
    int x = n;
    while(x!=0){
        rem = x % 10;
        sum = sum + rem;
        pro = pro * rem;
        x = x/10;
    }
    return pro - sum;
    
}