class Solution {
    int count(int n){
        if(n<=9) return n;
        int t=0;
        while(n>0){
            t+=(n%10);
            n/=10;
        }
        return t;
    }
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> hp=new HashMap<>();
        int m=0,c=0;
        for(int i=1;i<=n;i++){
            hp.put(count(i),hp.getOrDefault(count(i),0)+1);
            m=Math.max(m,hp.get(count(i)));
        }
        for(int i:hp.keySet()){
            if(hp.get(i)==m) c++;
        }
        return c;
    }
}