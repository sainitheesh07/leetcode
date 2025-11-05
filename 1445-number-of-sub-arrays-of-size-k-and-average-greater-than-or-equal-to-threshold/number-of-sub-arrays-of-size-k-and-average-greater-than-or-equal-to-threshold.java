class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l=0,t=0;
        for(int i=0;i<k;i++){
            t+=arr[i];
        }
        if(t/k>=threshold) l++;
        for(int i=k;i<arr.length;i++){
            t+=arr[i]-arr[i-k];
            if(t/k>=threshold) l++;
        }
        return l;
    }
}