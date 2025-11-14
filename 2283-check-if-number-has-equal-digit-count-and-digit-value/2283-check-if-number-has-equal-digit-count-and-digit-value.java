class Solution {
    public boolean digitCount(String num) {
        HashMap<Integer,Integer>=hp new HashMap<>();
        int t=0;
        for(int i=0;i<num.length();i++){
            char c=num.charAt(i);
            int a=c-'0';
            if(!hp.contains(c)) hp.put(a,1);
            else hp.put(a,t+1);
        }
        for(int i=0;i<nums.length();i++){
            char c=nums.charAt(i);
            int a=c-'0';
            if(hp.get(i)!=a) return false;
        }
        return true;
    }
}