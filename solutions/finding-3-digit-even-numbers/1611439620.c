/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findEvenNumbers(int* digits, int digitsSize, int* returnSize) {
    int *result = (int*)malloc(450*sizeof(int)); // prepare the largest space
    int t = 0;
    int n = digitsSize;
    int hash[10] = {0};
    for (int j = 0; j < n; j++) {
        hash[digits[j]]++;
    }
    for (int i = 100; i < 999; i += 2) {
        // get the number's count that digits have
        int a = i % 10; 
        int b = (i/10) % 10; 
        int c = ((i/10)/10) % 10; 
        if (a == b && b == c) { // three are the same
            if (hash[a]-3 >= 0) {
                result[t++] = i;
            }
        }
        else if (a == b && b != c) { // a and b is same but not c
            if (hash[a]-2 >= 0 && hash[c]-1 >= 0) {
                result[t++] = i;
            }
        }
        else if (c == b && b != a) { // c and b is same but not a
            if (hash[c]-2 >= 0 && hash[a]-1 >= 0) {
                result[t++] = i;
            }
        }
        else if (a == c && c != b) { // a and c is same but not b
            if (hash[a]-2 >= 0 && hash[b]-1 >= 0) {
                result[t++] = i;
            }
        }
        else {
            if (hash[a]-1 >= 0 && hash[b]-1 >= 0 && hash[c]-1 >= 0) { 
                result[t++] = i;
            }
        }
    }
    *returnSize = t;
    return result;
}