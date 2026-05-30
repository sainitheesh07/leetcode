class Solution {
    public int countCompleteDayPairs(int[] hours) {
        HashMap<Integer,Integer> hp=new HashMap<>();
        int c=0;
        for(int i:hours){
            int r=i%24;
            if(r==0) c+=hp.getOrDefault(0,0);
            else c+=hp.getOrDefault(24-r,0);
            hp.put(r,hp.getOrDefault(r,0)+1);
        }
        return c;
    }
}