bool squareIsWhite(char* coordinates) {
    int a = ((coordinates[0] - 'a')+1) + (coordinates[1] - '0');
    return (a%2!=0);
}