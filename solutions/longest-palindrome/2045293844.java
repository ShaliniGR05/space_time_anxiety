class Solution {
    public int longestPalindrome(String s) {
        int[] frq = new int[123];
        for(char ch : s.toCharArray()){
            frq[ch]++;
        }  
        int ans = 0;
        boolean hasodd = false;
        for(int count : frq){
            if(count%2==0){
                ans += count;
            }
            else{
                ans += count -1;
                hasodd = true;
            }
        }
        if(hasodd){
            ans++;
        }
        return ans;
    }
}