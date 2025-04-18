int countPrimeSetBits(int left, int right) {
    int count=0;
    long int countprime=0;
    int check = 0;
    if(left==0){
        left = left + 1;
    }
    for(int i=left;i<=right;i++){
        count = 0;
        int temp = i;
        check = 0;
        while(temp){
            temp = ((temp-1)&temp);
            count += 1;
        }
        if(count<2){
            check = 1;
        }
        else{
        for(int j =2;j<count;j++){
            if(count%j==0){
                check = 1;
                break;
            }
        }
        }
        if(check!=1){
            countprime = countprime + 1;
        }
    }
    return countprime;
    

}