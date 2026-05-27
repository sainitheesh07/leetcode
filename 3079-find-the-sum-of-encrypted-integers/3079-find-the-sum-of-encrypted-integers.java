class Solution {
    public int encrypt(int n){
        int length=0,rem=0,m=0;
        while(n>0){
            rem=n%10;
            if(rem>m) m=rem;
            length++;
            n/=10;
        }
        System.out.println(m);
        int num=0,i=0;
        while(i<length){
            num=num*10+m;
            i++;
        }
        return num;
    }
    public int sumOfEncryptedInt(int[] nums) {
        int s=0;
        for(int i=0;i<nums.length;i++){
            s+=encrypt(nums[i]);
        }
        return s;
    }
}