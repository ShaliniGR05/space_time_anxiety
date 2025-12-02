class Solution {
    public int largestAltitude(int[] gain) {
        int now = 0;
        int max = 0;
        for(int i=0;i<gain.length;i++){
            now = now + gain[i];
            if(max<now) max = now;
        }
        return max;
    }
}