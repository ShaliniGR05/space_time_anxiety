int distanceTraveled(int mainTank, int additionalTank) {
    if(mainTank<5) return mainTank*10;
    int a = 0;
    while(mainTank>=5 && additionalTank>=0){
        mainTank = mainTank - 5;
        a = a + 5;
        if(additionalTank>0){
            additionalTank = additionalTank - 1;
            mainTank = mainTank+1; 
        }
        
    }
    a = a + mainTank;
    return a * 10;
    
}