int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
    int tot = arrivalTime + delayedTime ;
    return tot%24;
}