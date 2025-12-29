class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       StringBuilder one = new StringBuilder();
       for(String a : word1){
        one.append(a);
       }
       StringBuilder two = new StringBuilder();
       for(String b : word2){
        two.append(b);
       }
       return one.toString().equals(two.toString());
    }
}