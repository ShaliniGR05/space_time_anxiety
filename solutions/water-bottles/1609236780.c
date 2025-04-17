int numWaterBottles(int numBottles, int numExchange) {
    int nb = numBottles;
    int ne = numExchange;
    int full = nb;
    int empty = nb;
    int q = 0;
    int rem = 0;
    while(empty>=ne){
        q = empty/ne;
        rem = full % ne;
        full = full + q;
        empty = q + rem;
    }
    return full;
    
}