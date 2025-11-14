class Solution {
    public boolean div(int n){
        int t=n;
        while(n>0){
            int r=n%10;
            if(r==0) return false; 
            if(t%r!=0) return false;
            n/=10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(div(i)) a.add(i);
        }
        return a;
    }
}