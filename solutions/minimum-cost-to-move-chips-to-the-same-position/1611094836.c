int minCostToMoveChips(int* position, int positionSize) {
    int even =0 ,odd = 0;
    for(int i =0;i<positionSize;i++){
        if(position[i]%2==0){
            even += 1;
        }
        else{
            odd += 1;
        }
    }
    if(odd>even) return even;
    else return odd;
}