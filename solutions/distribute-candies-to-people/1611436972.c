/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* distributeCandies(int candies, int num_people, int* returnSize) {
    *returnSize = num_people;
    int* res = (int*)calloc(num_people, sizeof(int));
    int i = 0, give = 1;

    while (candies > 0) {
        int index = i % num_people;
        int give_now = (candies < give) ? candies : give;
        res[index] += give_now;
        candies -= give_now;
        give++;
        i++;
    }

    return res;
}