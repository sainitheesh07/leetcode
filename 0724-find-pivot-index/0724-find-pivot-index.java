class Solution {
    public int pivotIndex(int[] nums) {
        int[] p=new int [nums.length];
        int[] l=new int [nums.length];
        p[0]=nums[0];
        l[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            p[i]=nums[i]+p[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            l[i]=nums[i]+l[i+1];
        }
        System.out.println(Arrays.toString(p));
        System.out.println(Arrays.toString(l));
        for(int i=0;i<nums.length;i++){
            if(p[i]==l[i]) return i;
        }
        return -1;
    }
}