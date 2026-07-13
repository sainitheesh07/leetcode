class Solution {
    boolean count(int num){
        int c=0;
        while(num>0){
            c++;
            num/=10;
        }
        return c%2==0;
    }
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i:nums){
            if(count(i)) c++;
        }
        return c;
    }
}