bool isPalindrome(int x) {
    int n = x;
    long rev =0;
    int rem =0;
    if(x<0){
        return false;
    } 
    while(n!=0){
        rem = n%10;
        rev = rem + rev*10;
        n = n/10;
    }
    if(rev==x){
        return true;
    }
    else{
        return false;
    }
    
}