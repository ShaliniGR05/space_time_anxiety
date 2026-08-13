class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet hs = new HashSet<>();
        for(int i : nums1){
            hs.add(i);
        }
        HashSet<Integer> hs2 = new HashSet<>();
        for(int i : nums2){
            if(hs.contains(i)){
                hs2.add(i);
            }
        }

        return hs2.stream().mapToInt(Integer::intValue).toArray();

    }
}