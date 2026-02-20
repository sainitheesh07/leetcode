class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int s=0;
        for(int i=0;i<arr.length;i++){
            int a=0,c=0;
            for(int j=i;j<arr.length;j++){
                a+=arr[j];
                c++;
                if(c%2!=0) s+=a;
            }
        }
        return s;
    }
}