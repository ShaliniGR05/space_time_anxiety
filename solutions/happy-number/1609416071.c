bool isHappy(int n) {
    if(n==1) return 1;
    int num = n;
    int sum = 0,rem = 0;
    while(n!=1 && n!=4){
        sum = 0;
        while(n!=0){
            rem = n % 10;
            sum = sum + (rem*rem);
            n = n/10;
        }
        n = sum;
    }
    if(sum == 1){
        return true;
    }
    return false;
}