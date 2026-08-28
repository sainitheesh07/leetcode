class Solution {
    public double trimMean(int[] arr) {
        double s=0,t=0;
        int n=arr.length;
        int set=5*n/100;
        int start=set,end=n-set;
        t=end-start;
        Arrays.sort(arr);
        for(int i=start;i<end;i++){
            s+=arr[i];
        }
        return s/t;
    }
}