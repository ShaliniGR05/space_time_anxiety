class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        String[] sorted = new String[n];
        for(int i=0;i<n;i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            sorted[i] = new String(ch);
        }
        boolean[] visit = new boolean[n];
        List<List<String>> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            if (visit[i]) continue;
            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visit[i] = true;
            for(int j=i+1;j<n;j++){
                if(!visit[j] && sorted[i].equals(sorted[j])){
                    group.add(strs[j]);
                    visit[j] = true; 
                }
            }
            result.add(group);
        }
        return result;
    }
}