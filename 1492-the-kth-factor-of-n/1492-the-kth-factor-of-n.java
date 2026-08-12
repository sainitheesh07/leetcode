class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0) l.add(i);
        }
        System.out.println(l);
        return k>l.size()?-1:l.get(k-1);
    }
}