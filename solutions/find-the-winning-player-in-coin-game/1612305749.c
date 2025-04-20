char* winningPlayer(int x, int y) {
   int round = (y/4 < x)?(y/4):x;
   return (round%2)==1?"Alice":"Bob";
}