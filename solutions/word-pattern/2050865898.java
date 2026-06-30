class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> cs = new HashMap<>();
        HashMap<String,Character> sc = new HashMap<>();
        String[] arr = s.split(" ");
        if (pattern.length() != arr.length) {
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            String st = new String(arr[i]);
            if(!cs.containsKey(ch)){
                cs.put(ch,st);
            }
            else {
                if(!cs.get(ch).equals(st)){
                    return false;
                }
            }
            if(!sc.containsKey(st)){
                sc.put(st,ch);
            }
            else {
                if(!sc.get(st).equals(ch)){
                    return false;
                }
            }  
        }
        return true;
    }
}