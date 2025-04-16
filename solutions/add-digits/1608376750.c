int addDigits(int num) {
    if(num==0){
        return 0;
    }
    if(num<10){
        return num;
    }
    int rem = 0;
    int n = num;
    int check = 0;
    int sum = 0;
    while(check!=1){
        sum = 0;
        while(n!=0){
            rem = n % 10;
            sum = sum + rem;
            n = n/10;
            }
        if(sum<10){
            check = 1;
            }
        else{
            n = sum;
        }

    }
    return sum;
}