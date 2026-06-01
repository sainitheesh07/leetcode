class Solution {
    public int commonFactors(int a, int b) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=1;i<=a;i++){
            if(a%i==0) hs.add(i);
        }
        int c=0;
        for(int i=1;i<=b;i++){
            if(b%i==0 && hs.contains(i)) c++;
        }
        return c;
    }
}