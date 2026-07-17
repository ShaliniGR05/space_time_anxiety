class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()){
            return false;
        }
        if(ransomNote.length() == 1 && magazine.length() == 1 && !ransomNote.equals(magazine)){
            return false;
        }
        HashMap<Character, Integer> res1 = new HashMap<>();
        for (char ch : magazine.toCharArray()) {
            res1.put(ch, res1.getOrDefault(ch, 0) + 1);
        }
        HashMap<Character, Integer> res2 = new HashMap<>();
        for (char ch : ransomNote.toCharArray()) {
            res2.put(ch, res2.getOrDefault(ch, 0) + 1);
        }
        for (char ch : ransomNote.toCharArray()) {
            if(!(res1.getOrDefault(ch, 0)>=res2.get(ch))){
                return false;
            }
        }
        return true;
        }
    }
