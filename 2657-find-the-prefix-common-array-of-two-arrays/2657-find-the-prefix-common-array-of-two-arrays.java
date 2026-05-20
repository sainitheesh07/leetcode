class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] c=new int [A.length];
        HashSet<Integer> hs=new HashSet<>();
        int t=0;
        for(int i=0;i<A.length;i++){
            int a=A[i];
            int b=B[i];
            if(a==b){
                t++;
                hs.add(a);
                c[i]=t;
            }
            else{
                if(hs.contains(a)) t+=1;
                if(hs.contains(b)) t+=1;
                hs.add(a);
                hs.add(b);
                c[i]=t;
            }
        }
        return c;
    }
}