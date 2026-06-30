class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!= t.length()){
            return false;
        }
        HashMap<Character,Character> st = new HashMap<>();
        HashMap<Character,Character> ts = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char chars = s.charAt(i);
            char chart = t.charAt(i);
            if(!st.containsKey(chars) && !ts.containsKey(chart)){
                st.put(chars,chart);
                ts.put(chart,chars);
            }
            else {
                if(!st.containsKey(chars) || !ts.containsKey(chart) || st.get(chars) != chart || ts.get(chart) != chars){
                return false;
                }
            }
        }
        return true;
    }
}