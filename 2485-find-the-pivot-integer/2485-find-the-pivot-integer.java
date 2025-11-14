class Solution {
    public int pivotInteger(int n) {
        int s=0;
        for(int i=0;i<=n;i++){
            s+=i;
        }
        int t=0;
        for(int i=n;i>0;i--){
            t+=i;
            if(t==s) return i;
            s-=i;
            System.out.println(s+" "+t);
            
        }
        return -1;
    }
}