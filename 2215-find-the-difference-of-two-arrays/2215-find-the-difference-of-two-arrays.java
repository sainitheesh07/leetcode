class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> n1=new ArrayList<>();
        List<Integer> n2=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        HashSet<Integer> h1 =new HashSet<>();
        HashSet<Integer> h2 =new HashSet<>();
        for(int i:nums1) h1.add(i);
        for(int i:nums2) h2.add(i);
        for(int i:h1){
            if(!h2.contains(i)) n1.add(i);
        }
        ans.add(n1);
        for(int i:h2){
            if(!h1.contains(i)) n2.add(i);
        }
        ans.add(n2);
        return ans;
    }
}