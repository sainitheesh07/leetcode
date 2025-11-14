class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> al=new ArrayList<>();
        ArrayList<Integer> fr=new ArrayList<>();
            fr.add(1);
            al.add(fr);
        for(int i=1;i<n;i++){
            ArrayList<Integer> t=new ArrayList<>();
            t.add(1);
            for(int j=1;j<i;j++){
                int v=al.get(i-1).get(j-1)+al.get(i-1).get(j);
                t.add(v);
            }
            t.add(1);
            al.add(t);
        }
        return al;
    }
}