class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> result = new HashMap<>();
        for(String word : strs){
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(!result.containsKey(key)){
                result.put(key,new ArrayList<>());
            }
            result.get(key).add(word);
        }
        return new ArrayList<>(result.values());
    }
}