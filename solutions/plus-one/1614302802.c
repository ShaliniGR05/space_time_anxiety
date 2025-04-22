/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* plusOne(int* digits, int digitsSize, int* returnSize) {
    *returnSize = digitsSize;
    int n = digitsSize;
        int check = 0;
        for(int i=0;i<n;i++){
            if(digits[i] == 9) check += 1;
        }
        if(check == n){
            digits = malloc((digitsSize+1) * sizeof(int));
            digits[0] = 1;
            for(int i=1;i<=digitsSize;i++){
               digits[i] = 0;
            }
            *returnSize = digitsSize+1;
            return digits;
        }
        else{
            for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i] +=1;
                return digits;
            }
            digits[i] = 0;
        }
        }
    return digits; 
}