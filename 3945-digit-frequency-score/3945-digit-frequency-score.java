class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> hp=new HashMap<>();
        int s=0;
        while(n>0){
            int rem=n%10;
            hp.put(rem,hp.getOrDefault(rem,0)+1);
            n/=10;
        }
        for(Integer i:hp.keySet()){
            s+=i*(hp.get(i));
        }
        return s;
    }
}