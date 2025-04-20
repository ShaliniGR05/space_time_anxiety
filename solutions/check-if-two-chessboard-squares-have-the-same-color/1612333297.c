bool checkTwoChessboards(char* coordinate1, char* coordinate2) {
    int a = ((coordinate1[0] - 'a') +1) + (coordinate1[1] - '0');
    int b = ((coordinate2[0] - 'a') +1) + (coordinate2[1] - '0');
    return (a%2 == b%2);
}